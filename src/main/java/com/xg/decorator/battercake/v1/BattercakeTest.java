package com.xg.decorator.battercake.v1;

/**
 * @program: decorator
 * @description: 煎饼v1测试
 * @author: gzk
 * @create: 2019-12-16 10:40
 **/
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "   " + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + "    " + battercakeWithEgg.getPrice());


        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + "    " + battercakeWithEggAndSausage.getPrice());
    }
}
