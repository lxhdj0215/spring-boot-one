//package com.lxhdj.netty.one;
//
//import io.netty.bootstrap.Bootstrap;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.ChannelOption;
//import io.netty.channel.EventLoopGroup;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioSocketChannel;
//
//public class EchoClient {
//
//    private final String host;
//    private final int port;
//    private final int firstMessageSize;
//
//    public EchoClient(String host, int port, int firstMessageSize) {
//        this.host = host;
//        this.port = port;
//        this.firstMessageSize = firstMessageSize;
//    }
//
//    public void run() throws Exception {
//        // Configure the client.
//        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
//        try {
//            Bootstrap bootstrap = new Bootstrap();
//            bootstrap.group(eventLoopGroup)
//                    .channel(NioSocketChannel.class)
//                    .option(ChannelOption.TCP_NODELAY, true)
//                    .handler(new ChannelInitializer<SocketChannel>() {
//                        @Override
//                        public void initChannel(SocketChannel ch) throws Exception {
//                            ch.pipeline().addLast(
//                                    //new LoggingHandler(LogLevel.INFO),
//                                    new EchoClientHandler(firstMessageSize));
//                        }
//                    });
//
//            // Start the client.
//            ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
//
//            // Wait until the connection is closed.
//            channelFuture.channel().closeFuture().sync();
//        } finally {
//            // Shut down the event loop to terminate all threads.
//            eventLoopGroup.shutdownGracefully();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
////        final String host = args[0];
////        final int port = Integer.parseInt(args[1]);
////        final int firstMessageSize;
////        if (args.length == 3) {
////            firstMessageSize = Integer.parseInt(args[2]);
////        } else {
////            firstMessageSize = 256;
////        }
//        String host = "127.0.0.1";
//        int port = 8080;
//        int firstMessageSize = 100;
//        new EchoClient(host, port, firstMessageSize).run();
//    }
//}
