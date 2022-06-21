package com.lxhdj.netty.two;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

@ChannelHandler.Sharable //标记该类的实例可以被多个Channel共享
public class FirstNettyClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    /**
     * 和服务器连接建立后将被调用
     */
    public void channelActive(ChannelHandlerContext ctx) {
        //当被通知Channel是活跃的时候，发送一条消息
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
        // ctx.writeAndFlush("Netty rocks!");

    }
    /**
     * 当从服务器接收到一条消息时被调用
     */
    @Override
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        System.out.println("Client received:" + in.toString(CharsetUtil.UTF_8));
    }
    /**
     * 引发异常时会被调用
     */
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.out.println("Can't connect server");
        //发生异常时，记录错误并关闭Channel
        cause.printStackTrace();
        ctx.close();
    }
}

