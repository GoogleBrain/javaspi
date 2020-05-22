package cn.yufu.inter.impl;

import cn.yufu.inter.IShout;

public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
