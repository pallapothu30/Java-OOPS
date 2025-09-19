package com.mani.introduction;

public class Misc {
    public static void main(String[] args) {
        // final keyword does let anyone modify the value of it;
        // say everyone pay increases by 2%.
        // prevent your content to be modified.
        final int increase = 2; // cannot be modified.
        Integer a = 10;  // in java everything is pass by value.
        Integer b = 20;
        System.out.println("a:" + a + " b: " + b + "\n");
        swap(a,b);
        System.out.println("a:" + a + " b: " + b + "\n");

    }
    static void swap(Integer a, Integer b){
        Integer temp = b;
        b = a;
        a = temp;
    }
}
