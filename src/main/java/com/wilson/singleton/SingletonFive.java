package com.wilson.singleton;

import com.sun.deploy.util.StringUtils;

/**
 * 静态内部类虽然保证了单例在多线程并发下的线程安全性，但是在遇到序列化对象时，默认的方式运行得到的结果就是多例的
 *
 */
public class SingletonFive {
    private SingletonFive(){}
    //静态的内部类
    private static class initObject{
        private static SingletonFive singletonFive = new SingletonFive();
    }

    public static SingletonFive getSingletonFive(){

        return initObject.singletonFive;
    }
}
