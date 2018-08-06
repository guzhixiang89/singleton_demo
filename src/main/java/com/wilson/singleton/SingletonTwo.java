package com.wilson.singleton;

public class SingletonTwo {
    private SingletonTwo(){}

    private static SingletonTwo singletonTwo = null;

    //该例子虽然使用延迟加载方式实现了懒汉式单例，但是在多线程下会出现多个singleton对象
    public  static SingletonTwo getSingletonTwo(){
        if(null == singletonTwo){
            singletonTwo = new SingletonTwo();
        }
        return  singletonTwo;
    }
}
