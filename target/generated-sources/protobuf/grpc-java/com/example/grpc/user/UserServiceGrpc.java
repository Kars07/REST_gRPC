package com.example.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.GetUserRequest,
      com.example.grpc.user.UserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.example.grpc.user.GetUserRequest.class,
      responseType = com.example.grpc.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.GetUserRequest,
      com.example.grpc.user.UserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.GetUserRequest, com.example.grpc.user.UserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.GetUserRequest, com.example.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.Empty,
      com.example.grpc.user.UserListResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = com.example.grpc.user.Empty.class,
      responseType = com.example.grpc.user.UserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.Empty,
      com.example.grpc.user.UserListResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.Empty, com.example.grpc.user.UserListResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.Empty, com.example.grpc.user.UserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.CreateUserRequest,
      com.example.grpc.user.UserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.example.grpc.user.CreateUserRequest.class,
      responseType = com.example.grpc.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.CreateUserRequest,
      com.example.grpc.user.UserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.CreateUserRequest, com.example.grpc.user.UserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.CreateUserRequest, com.example.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.UpdateUserRequest,
      com.example.grpc.user.UserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.example.grpc.user.UpdateUserRequest.class,
      responseType = com.example.grpc.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.UpdateUserRequest,
      com.example.grpc.user.UserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.UpdateUserRequest, com.example.grpc.user.UserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.UpdateUserRequest, com.example.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.DeleteUserRequest,
      com.example.grpc.user.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.example.grpc.user.DeleteUserRequest.class,
      responseType = com.example.grpc.user.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.DeleteUserRequest,
      com.example.grpc.user.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.DeleteUserRequest, com.example.grpc.user.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.DeleteUserRequest, com.example.grpc.user.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.user.Empty,
      com.example.grpc.user.UserResponse> getStreamUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUsers",
      requestType = com.example.grpc.user.Empty.class,
      responseType = com.example.grpc.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.user.Empty,
      com.example.grpc.user.UserResponse> getStreamUsersMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.user.Empty, com.example.grpc.user.UserResponse> getStreamUsersMethod;
    if ((getStreamUsersMethod = UserServiceGrpc.getStreamUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getStreamUsersMethod = UserServiceGrpc.getStreamUsersMethod) == null) {
          UserServiceGrpc.getStreamUsersMethod = getStreamUsersMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.user.Empty, com.example.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("StreamUsers"))
              .build();
        }
      }
    }
    return getStreamUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUser(com.example.grpc.user.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void getAllUsers(com.example.grpc.user.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    /**
     */
    default void createUser(com.example.grpc.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(com.example.grpc.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.example.grpc.user.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    default void streamUsers(com.example.grpc.user.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamUsersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(com.example.grpc.user.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.example.grpc.user.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.example.grpc.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.example.grpc.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.example.grpc.user.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamUsers(com.example.grpc.user.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.user.UserResponse getUser(com.example.grpc.user.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserListResponse getAllUsers(com.example.grpc.user.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserResponse createUser(com.example.grpc.user.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserResponse updateUser(com.example.grpc.user.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.Empty deleteUser(com.example.grpc.user.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.user.UserResponse> streamUsers(
        com.example.grpc.user.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserResponse> getUser(
        com.example.grpc.user.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserListResponse> getAllUsers(
        com.example.grpc.user.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserResponse> createUser(
        com.example.grpc.user.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserResponse> updateUser(
        com.example.grpc.user.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.Empty> deleteUser(
        com.example.grpc.user.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_GET_ALL_USERS = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_STREAM_USERS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.example.grpc.user.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.example.grpc.user.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserListResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.example.grpc.user.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.example.grpc.user.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.example.grpc.user.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.Empty>) responseObserver);
          break;
        case METHODID_STREAM_USERS:
          serviceImpl.streamUsers((com.example.grpc.user.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.user.GetUserRequest,
              com.example.grpc.user.UserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetAllUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.user.Empty,
              com.example.grpc.user.UserListResponse>(
                service, METHODID_GET_ALL_USERS)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.user.CreateUserRequest,
              com.example.grpc.user.UserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.user.UpdateUserRequest,
              com.example.grpc.user.UserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.user.DeleteUserRequest,
              com.example.grpc.user.Empty>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getStreamUsersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.user.Empty,
              com.example.grpc.user.UserResponse>(
                service, METHODID_STREAM_USERS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.user.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getGetAllUsersMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getStreamUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
