package com.mani.singleton;

public class SingleTon {

    // don't let others create objects using constructor
    private SingleTon(){

    }

    private static SingleTon INSTANCE;

    public static SingleTon getInstance(){
        // check whether 1 obj is created or not.
        if(INSTANCE==null){
            INSTANCE = new SingleTon();
        }
        return INSTANCE;
    }
}
