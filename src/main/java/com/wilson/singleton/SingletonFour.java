package com.wilson.singleton;

public class SingletonFour {
    private  SingletonFour(){};

    private static SingletonFour singletonFour = null;

    public static SingletonFour getSingletonFour(){
        if(null == singletonFour){
            synchronized(SingletonFour.class){
                if(null == singletonFour){
                    singletonFour = new SingletonFour();
                }
            }
        }
        return singletonFour;
    }
}
