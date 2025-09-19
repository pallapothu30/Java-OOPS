package com.mani.introduction;



public class Introduction {

    static void changeVal(Integer x){
        x = 11;
        // allocation x to new object changes its reference.

    }

    public static void main(String[] args) {
        System.out.println("we are doing OOPS with java for the first time.");

        // pass by reference and pass by value demo.
        Integer n = 100;
        System.out.println(n);
        n = 10;
        changeVal(n);
        System.out.println(n);

        //
    }
}

