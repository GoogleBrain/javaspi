package cn.yufu.inter.impl;

import cn.yufu.inter.IShout;

public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}