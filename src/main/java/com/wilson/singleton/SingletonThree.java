package com.wilson.singleton;

public class SingletonThree {
    private  SingletonThree(){}

    private static SingletonThree singletonThree = null;

    public  static SingletonThree getSingletonThree(){
        // 等同于 synchronized public static Singleton3 getInstance()
        synchronized(SingletonThree.class){
            // 注意：里面的判断是一定要加的，否则出现线程安全问题
            if(null == singletonThree){
                singletonThree = new SingletonThree();
            }
        }
        return  singletonThree;
    }
}
