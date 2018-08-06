package com.wilson.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 基于CAS的单例模式
 */
public class SingletonCas {
    private SingletonCas(){}

    private static final AtomicReference<SingletonCas> INSTANCE  = new AtomicReference<>();

    public static final SingletonCas getInstance(){
        for(;;){
            SingletonCas cur = INSTANCE.get();
            if(null != cur){
                return  cur;
            }
            cur = new SingletonCas();
            if (INSTANCE.compareAndSet(null,cur)){
                return cur;
            }
        }
    }
}
