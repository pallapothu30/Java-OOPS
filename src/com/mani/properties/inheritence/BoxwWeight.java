package com.mani.properties.inheritence;

public class BoxwWeight extends Box{
    double weight;

    public BoxwWeight(){
        this.weight = -1;
    }
    public BoxwWeight(double l, double h,double w, double weight){
//        super(l,w,h); // this is call the parent class constructor.
        // used to initalize values present in parent class.f
        this.weight = weight;
    }
}
