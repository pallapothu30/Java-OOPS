package com.mani.singleton;

public class Main {
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
        // all objects refence to same instance.
    }
}
