package com.xg.decorator.battercake.v2;

/**
 * @program: decorator
 * @description:
 * @author: gzk
 * @create: 2019-12-16 10:52
 **/
public class SausageDecorator extends BattercakeDecorator {


    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }


    @Override
    protected String getMsg() {
        return super.getMsg() + "+香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
