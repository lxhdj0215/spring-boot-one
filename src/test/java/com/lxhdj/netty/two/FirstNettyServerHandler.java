//package com.lxhdj.netty.two;
//
//import io.netty.buffer.ByteBuf;
//import io.netty.buffer.Unpooled;
//import io.netty.channel.ChannelFutureListener;
//import io.netty.channel.ChannelHandler;
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.ChannelInboundHandlerAdapter;
//import io.netty.util.CharsetUtil;
//
///**
// * 用于响应事件处理
// */
//@ChannelHandler.Sharable //标示一个Channel-Handler可以被多个Channel安全地共享
//public class FirstNettyServerHandler extends ChannelInboundHandlerAdapter {
//    /**
//     * 每个传入的消息都会调用该方法
//     *
//     * @param ctx
//     * @param msg
//     */
//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) {
//        ByteBuf in = (ByteBuf) msg;
//        //将接收到的消息进行打印输出
////        System.out.println("Server received:" + in.toString());
//        System.out.println("Server received:" + in.toString(CharsetUtil.UTF_8));
//        //将接收到的消息写给发送者
//        ctx.write(in);
//    }
//
//    /*
//     *通知ChannelInboundHander最后一次对channelRead()的调用是当前批量读取中的最后一条消息
//     */
//    @Override
//    public void channelReadComplete(ChannelHandlerContext ctx) {
//        /**
//         * 将目前暂存于ChannelOutboundBuffer中的消息
//         *冲刷到远程节点，并且关闭该Channel
//         */
//        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
//                .addListener(ChannelFutureListener.CLOSE);
//    }
//
//
//    /*
//     * 在读取期间，有异常抛出时会调用
//     */
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        // 打印异常栈跟踪
//        cause.printStackTrace();
//        //关闭该channel
//        ctx.close();
//    }
//}
