package com.mani.staticExample;

//this is demo to show initialisation of static variables.
public class StaticInt {
    static int a = 5;
    static int b;
    static {
        System.out.println("im in static block");
        b = a*5;
    }

    public static void main(String[] args){

        System.out.println("a:" + StaticInt.a + " b:" + StaticInt.b);

        StaticInt obj1 = new StaticInt();
        StaticInt.b +=3;

        System.out.println("a:" + StaticInt.a + " b:" + StaticInt.b);

        StaticInt obj2 = new StaticInt();

        System.out.println("a:" + a + " b:" + b);
        
    }
}
