package com.learn.spring.grpcserver;

import com.learn.spring.grpc.HelloServiceGrpc;
import com.learn.spring.grpc.Info;
import com.learn.spring.grpc.Response;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@GRpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Value("${id}")
    String id;
    @Override
    public void hello(
        final Info request, final StreamObserver<Response> responseObserver
    ) {
        Response.Builder builder = Response.newBuilder().setMsg(id);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
