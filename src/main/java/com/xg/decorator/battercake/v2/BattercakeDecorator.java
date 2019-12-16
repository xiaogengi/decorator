package com.xg.decorator.battercake.v2;

/**
 * @program: decorator
 * @description: 煎饼装饰者
 * @author: gzk
 * @create: 2019-12-16 10:45
 **/
public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }


    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
