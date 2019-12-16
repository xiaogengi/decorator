package com.xg.decorator.battercake.v1;

/**
 * @program: decorator
 * @description: 煎饼+鸡蛋+烤肠
 * @author: gzk
 * @create: 2019-12-16 10:38
 **/
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {


    @Override
    protected String getMsg() {
        return super.getMsg() + "+烤肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
