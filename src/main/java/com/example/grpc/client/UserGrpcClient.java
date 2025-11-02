// UserGrpcClient.java - gRPC Client
package com.example.grpc.client;

import com.example.grpc.user.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class UserGrpcClient {
private final ManagedChannel channel;
private final UserServiceGrpc.UserServiceBlockingStub blockingStub;
private final UserServiceGrpc.UserServiceStub asyncStub;

public UserGrpcClient(String host, int port) {
    // Create a channel to connect to the server
    this.channel = ManagedChannelBuilder
            .forAddress(host, port)
            .usePlaintext() // Disable TLS for development
            .build();
    
    // Create blocking and async stubs
    this.blockingStub = UserServiceGrpc.newBlockingStub(channel);
    this.asyncStub = UserServiceGrpc.newStub(channel);
}

// Blocking call to get a user
public UserResponse getUser(long id) {
    GetUserRequest request = GetUserRequest.newBuilder()
            .setId(id)
            .build();
    
    return blockingStub.getUser(request);
}

// Blocking call to get all users
public UserListResponse getAllUsers() {
    Empty request = Empty.newBuilder().build();
    return blockingStub.getAllUsers(request);
}

// Blocking call to create a user
public UserResponse createUser(String name, String email, String phone) {
    CreateUserRequest request = CreateUserRequest.newBuilder()
            .setName(name)
            .setEmail(email)
            .setPhone(phone)
            .build();
    
    return blockingStub.createUser(request);
}

// Blocking call to update a user
public UserResponse updateUser(long id, String name, String email, String phone) {
    UpdateUserRequest request = UpdateUserRequest.newBuilder()
            .setId(id)
            .setName(name)
            .setEmail(email)
            .setPhone(phone)
            .build();
    
    return blockingStub.updateUser(request);
}

// Blocking call to delete a user
public void deleteUser(long id) {
    DeleteUserRequest request = DeleteUserRequest.newBuilder()
            .setId(id)
            .build();
    
    blockingStub.deleteUser(request);
}

// Async call with streaming
public void streamUsers() throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(1);
    
    Empty request = Empty.newBuilder().build();
    
    asyncStub.streamUsers(request, new StreamObserver<UserResponse>() {
        @Override
        public void onNext(UserResponse user) {
            System.out.println("Received user: " + user.getName());
        }
        
        @Override
        public void onError(Throwable t) {
            System.err.println("Error: " + t.getMessage());
            latch.countDown();
        }
        
        @Override
        public void onCompleted() {
            System.out.println("Stream completed");
            latch.countDown();
        }
    });
    
    // Wait for stream to complete
    latch.await(1, TimeUnit.MINUTES);
}

// Shutdown the channel
public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
}

// Example usage
public static void main(String[] args) throws Exception {
    UserGrpcClient client = new UserGrpcClient("localhost", 9090);
    
    try {
        // Create a user
        UserResponse newUser = client.createUser(
            "John Doe", 
            "john@example.com", 
            "123-456-7890"
        );
        System.out.println("Created user: " + newUser);
        
        // Get user by ID
        UserResponse user = client.getUser(newUser.getId());
        System.out.println("Retrieved user: " + user);
        
        // Get all users
        UserListResponse allUsers = client.getAllUsers();
        System.out.println("Total users: " + allUsers.getUsersCount());
        
        // Stream users
        client.streamUsers();
        
        // Update user
        UserResponse updated = client.updateUser(
            newUser.getId(),
            "John Smith",
            "john.smith@example.com",
            "098-765-4321"
        );
        System.out.println("Updated user: " + updated);
        
        // Delete user
        client.deleteUser(newUser.getId());
        System.out.println("User deleted");
        
    } finally {
        client.shutdown();
    }
}

}