//package com.lxhdj.netty.two;
//
//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.EventLoopGroup;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioServerSocketChannel;
//
//import java.net.InetSocketAddress;
//
///**
// * 第一个Netty程序服务端
// */
//public class FirstNettyServer {
//    private final int port;
//
//    public FirstNettyServer(int port) {
//        this.port = port;
//    }
//
//    public static void main(String[] args) {
//        //启动服务器
//        try {
//            new FirstNettyServer(6666).start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void start() throws Exception {
//        final FirstNettyServerHandler serverHandler = new FirstNettyServerHandler();
//        //1. 创建EventLoopGroup
//        EventLoopGroup group = new NioEventLoopGroup();
//        try {
//            //2.创建Server-Bootstrap
//            ServerBootstrap bootstrap = new ServerBootstrap();
//            bootstrap.group(group)
//                    //3.指定所使用的NIO传输Channel
//                    .channel(NioServerSocketChannel.class)
//                    //4.使用指定的端口设置套接字地址
//                    .localAddress(new InetSocketAddress(port))
//                    //5.添加一个FirstNettyServerHandler到子Channel的ChannelPipeline
//                    .childHandler(new ChannelInitializer<SocketChannel>() {
//                        @Override
//                        protected void initChannel(SocketChannel channel) throws Exception {
//                            channel.pipeline().addLast(serverHandler);
//                        }
//                    });
//            //6. 异步绑定服务器，调用sync（）方法阻塞等待直到绑定完成
//            ChannelFuture channelFuture = bootstrap.bind().sync();
//            //7. 获取Channel的CloseFuture，并且阻塞当前线程直到它完成
//            channelFuture.channel().closeFuture().sync();
//        } finally {
//            //8. 关闭EventLoopGroup,释放所有资源
//            group.shutdownGracefully().sync();
//        }
//    }
//}
