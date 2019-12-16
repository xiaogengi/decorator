package com.xg.decorator.battercake.v2;

/**
 * @program: decorator
 * @description:
 * @author: gzk
 * @create: 2019-12-16 10:53
 **/
public class BattercakeTest {


    public static void main(String[] args) {
        Battercake def = new DefaultBattercake();



        def = new EggDecoratot(def);
        def = new EggDecoratot(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());
        def = new EggDecoratot(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());
        def = new EggDecoratot(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());
        def = new SausageDecorator(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());
        def = new SausageDecorator(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());
        def = new SausageDecorator(def);
        System.out.println(def.getMsg() + " 总价：" + def.getPrice());


    }

}
