//package com.lxhdj.netty.two;
//
//import io.netty.bootstrap.Bootstrap;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.EventLoopGroup;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioSocketChannel;
//
//import java.net.InetSocketAddress;
//
//public class FirstNettyClient {
//    private final String host;
//    private final int port;
//
//    public FirstNettyClient(String host, int port) {
//        this.host = host;
//        this.port = port;
//    }
//
//    public void start() throws Exception {
//        EventLoopGroup group = new NioEventLoopGroup();
//        try {
//            //创建Bootstrap
//            Bootstrap bootstrap = new Bootstrap();
//            //指定EventLoopGroup以处理客户端事件;需要适用于NIO的实现
//            bootstrap.group(group)
//                    //适用于NIO传输的Channel类型
//                    .channel(NioSocketChannel.class)
//                    //设置服务器的连接地址
//                    .remoteAddress(new InetSocketAddress(host, port))
//                    .handler(new ChannelInitializer<SocketChannel>() {
//                        //在创建Channel时，向ChannelPipeline中添加一个FirstNettyClientHandler实例
//                        @Override
//                        protected void initChannel(SocketChannel ch) throws Exception {
//                            ch.pipeline().addLast(new FirstNettyClientHandler());
//                        }
//                    });
//            //连接到远程节点，阻塞等待直到连接完成
//            ChannelFuture channelFuture = bootstrap.connect().sync();
//            //阻塞，直到Channel关闭
//            channelFuture.channel().closeFuture().sync();
//        } finally {
//            //关闭线程池并且释放所有的资源
//            group.shutdownGracefully().sync();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        new FirstNettyClient("127.0.0.1",6666).start();
//    }
//}
//
