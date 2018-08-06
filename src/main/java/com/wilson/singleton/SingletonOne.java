package com.wilson.singleton;

public class SingletonOne {
    //私有的构造器
    private SingletonOne(){}
    //私有的静态对象
    private static  SingletonOne singletonOne = new SingletonOne();
    //公有的静态方法创建或获取它本身的静态私有对象
    public static SingletonOne getSingletonOne() {
        return singletonOne;
    }
}
