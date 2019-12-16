package com.xg.decorator.battercake.v2;

/**
 * @program: decorator
 * @description: 基础套餐
 * @author: gzk
 * @create: 2019-12-16 10:44
 **/
public class DefaultBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
