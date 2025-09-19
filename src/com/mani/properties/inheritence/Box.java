package com.mani.properties.inheritence;

public class Box {
    private double length;
    double width;
    double height;

    Box(){
        System.out.println("i got called defualt constructor BOX");
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    // cube.
    Box(double side){
        this.width = side;
        this.length = side;
        this.height = side;
    }

    // cuboid.
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // copy constructor.
    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void displayInfo(){
        System.out.println("running box class.");
    }

}
