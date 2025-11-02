#!/bin/bash

# setup.sh - Script to create all Java files with proper encoding

echo "Creating project structure..."

# Create directories
mkdir -p src/main/java/com/example/restapi/model
mkdir -p src/main/java/com/example/restapi/repository
mkdir -p src/main/java/com/example/restapi/service
mkdir -p src/main/java/com/example/restapi/controller
mkdir -p src/main/java/com/example/grpc/service
mkdir -p src/main/java/com/example/grpc/client
mkdir -p src/main/proto
mkdir -p src/main/resources

echo "Creating User.java..."
cat > src/main/java/com/example/restapi/model/User.java << 'EOF'
package com.example.restapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    private String phone;
}
EOF

echo "Creating UserRepository.java..."
cat > src/main/java/com/example/restapi/repository/UserRepository.java << 'EOF'
package com.example.restapi.repository;

import com.example.restapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
EOF

echo "Creating UserService.java..."
cat > src/main/java/com/example/restapi/service/UserService.java << 'EOF'
package com.example.restapi.service;

import com.example.restapi.model.User;
import com.example.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User getUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }
    
    @Transactional
    public User createUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("User with email already exists");
        }
        return userRepository.save(user);
    }
    
    @Transactional
    public User updateUser(Long id, User userDetails) {
        User user = getUserById(id);
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhone(userDetails.getPhone());
        return userRepository.save(user);
    }
    
    @Transactional
    public void deleteUser(Long id) {
        User user = getUserById(id);
        userRepository.delete(user);
    }
}
EOF

echo "Creating UserController.java..."
cat > src/main/java/com/example/restapi/controller/UserController.java << 'EOF'
package com.example.restapi.controller;

import com.example.restapi.model.User;
import com.example.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
EOF

echo "Creating proto file..."
cat > src/main/proto/user_service.proto << 'EOF'
syntax = "proto3";

option java_multiple_files = true;
option java_package = "com.example.grpc.user";
option java_outer_classname = "UserServiceProto";

package user;

service UserService {
  rpc GetUser (GetUserRequest) returns (UserResponse);
  rpc GetAllUsers (Empty) returns (UserListResponse);
  rpc CreateUser (CreateUserRequest) returns (UserResponse);
  rpc UpdateUser (UpdateUserRequest) returns (UserResponse);
  rpc DeleteUser (DeleteUserRequest) returns (Empty);
  rpc StreamUsers (Empty) returns (stream UserResponse);
}

message Empty {}

message GetUserRequest {
  int64 id = 1;
}

message CreateUserRequest {
  string name = 1;
  string email = 2;
  string phone = 3;
}

message UpdateUserRequest {
  int64 id = 1;
  string name = 2;
  string email = 3;
  string phone = 4;
}

message DeleteUserRequest {
  int64 id = 1;
}

message UserResponse {
  int64 id = 1;
  string name = 2;
  string email = 3;
  string phone = 4;
}

message UserListResponse {
  repeated UserResponse users = 1;
}
EOF

echo "Creating application.properties..."
cat > src/main/resources/application.properties << 'EOF'
server.port=8080

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

grpc.server.port=9090

logging.level.com.example=DEBUG
logging.level.io.grpc=INFO
EOF

echo "All files created successfully!"
echo "Now run: mvn clean compile"