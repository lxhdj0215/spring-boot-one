package com.lxhdj.algorithm;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/4/7 7:35 下午
 */
public class Pair {
    Object item;
    int weight;

    public Pair(Object item, int weight){
        this.item = item;
        this.weight = weight;
    }

    public Object getItem() {
        return item;
    }

    public int getWeight() {
        return weight;
    }

}
