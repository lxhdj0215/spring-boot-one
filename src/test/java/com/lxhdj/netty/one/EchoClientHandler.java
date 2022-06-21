//package com.lxhdj.netty.one;
//
//import io.netty.buffer.ByteBuf;
//import io.netty.buffer.Unpooled;
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.ChannelInboundHandlerAdapter;
//import io.netty.util.CharsetUtil;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//public class EchoClientHandler extends ChannelInboundHandlerAdapter {
//
//
//    private final ByteBuf firstMessage;
//
//    /**
//     * Creates a client-side handler.
//     */
//    public EchoClientHandler(int firstMessageSize) {
//        if (firstMessageSize <= 0) {
//            throw new IllegalArgumentException("firstMessageSize: " + firstMessageSize);
//        }
//        firstMessage = Unpooled.buffer(firstMessageSize);
//        for (int i = 0; i < firstMessage.capacity(); i++) {
//            firstMessage.writeByte((byte) i);
//        }
//    }
//
//    @Override
//    public void channelActive(ChannelHandlerContext ctx) {
////        ctx.writeAndFlush(firstMessage);
//        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
//    }
//
//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        ByteBuf in = (ByteBuf) msg;
//        System.out.println(in.toString(CharsetUtil.UTF_8));
//        ctx.write(msg);
//    }
//
//    @Override
//    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
//        ctx.flush();
//    }
//
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        // Close the connection when an exception is raised.
////        logger.log(Level.WARNING, "Unexpected exception from downstream.", cause);
//        log.debug("Unexpected exception from downstream.", cause);
//        ctx.close();
//    }
//}
