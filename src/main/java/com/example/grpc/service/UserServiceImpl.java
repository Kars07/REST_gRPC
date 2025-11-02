package com.example.grpc.service;

import com.example.grpc.user.*;
import com.example.restapi.model.User;
import com.example.restapi.service.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    
    private final UserService userService;
    
    @Override
    public void getUser(GetUserRequest request, StreamObserver<UserResponse> responseObserver) {
        try {
            User user = userService.getUserById(request.getId());
            UserResponse response = mapToUserResponse(user);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    @Override
    public void getAllUsers(Empty request, StreamObserver<UserListResponse> responseObserver) {
        try {
            List<User> users = userService.getAllUsers();
            UserListResponse.Builder builder = UserListResponse.newBuilder();
            for (User user : users) {
                builder.addUsers(mapToUserResponse(user));
            }
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    @Override
    public void createUser(CreateUserRequest request, StreamObserver<UserResponse> responseObserver) {
        try {
            User user = new User();
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            
            User createdUser = userService.createUser(user);
            UserResponse response = mapToUserResponse(createdUser);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    @Override
    public void updateUser(UpdateUserRequest request, StreamObserver<UserResponse> responseObserver) {
        try {
            User user = new User();
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            
            User updatedUser = userService.updateUser(request.getId(), user);
            UserResponse response = mapToUserResponse(updatedUser);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    @Override
    public void deleteUser(DeleteUserRequest request, StreamObserver<Empty> responseObserver) {
        try {
            userService.deleteUser(request.getId());
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    @Override
    public void streamUsers(Empty request, StreamObserver<UserResponse> responseObserver) {
        try {
            List<User> users = userService.getAllUsers();
            for (User user : users) {
                UserResponse response = mapToUserResponse(user);
                responseObserver.onNext(response);
                Thread.sleep(100);
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
    
    private UserResponse mapToUserResponse(User user) {
        return UserResponse.newBuilder()
                .setId(user.getId())
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setPhone(user.getPhone() != null ? user.getPhone() : "")
                .build();
    }
}
