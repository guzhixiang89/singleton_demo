package com.wilson.singleton;

public class SingletonSix {
    private SingletonSix(){}

    private static SingletonSix singletonSix = null;
    //静态代码块
    static{
        singletonSix = new SingletonSix();
    }

    public static SingletonSix getSingletonSix(){
        return  singletonSix;
    }
}
