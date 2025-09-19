package com.mani.properties.inheritence;

public class Main {
    public static void main(String[] args) {
//        Box b = new Box(5,4,2);
//        Box b1 = new Box(b);
////        b1.length;  cannot access private.
//        System.out.println(b1.width + " " + b1.height);
//        BoxwWeight w1 = new BoxwWeight(7,4,2,100);
//        System.out.println(w1.height + " " + w1.weight);

        // it is type of reference varialbe not the type of the object that determine what variables cna be accessed.
//        Box box1 = new BoxwWeight(10,6,3,100);
//        System.out.println(box1.width);


        // there are many variable in both parent and child class
        // you are given access to variable of reference type of object. i.e BoxWeight.
        // hence you should be able to access the weight varialbe.
        // this also means, that the ones you are trying to access should be initialised.
        // but how can you access child class members when object itself is of type parent. how can you call child constructor.
        BoxwWeight box2 = new BoxwWeight(7,4,3,7777);
    }
}
