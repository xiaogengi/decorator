package com.xg.decorator.battercake.v2;

/**
 * @program: decorator
 * @description:
 * @author: gzk
 * @create: 2019-12-16 10:50
 **/
public class EggDecoratot extends BattercakeDecorator {


    public EggDecoratot(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
