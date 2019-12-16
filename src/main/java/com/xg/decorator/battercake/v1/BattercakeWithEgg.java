package com.xg.decorator.battercake.v1;

/**
 * 加鸡蛋的煎饼
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
