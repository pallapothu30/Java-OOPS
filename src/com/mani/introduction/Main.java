package com.mani.introduction;

// Class is just logic(Definition)/Blueprint for self defined things.
class Student{
    int rno;
    String name;
    float marks;
    // we need a way to initialize the data members to each object with respective values.
    /*
    When local variables (method or constructor parameters) have the same name as instance variables (fields),
    Java gives priority to local variables.
    To distinguish between them, we use this to refer to the current object’s instance variable.
    */
    Student(){
        this(1,"Unknown",0);
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name; // this resolves ambiguity.
        this.marks = marks;
    }
    void display(){
        System.out.println("com.mani.introduction.Student details:");
        System.out.println("name: "+ name + " \nrno: " + rno + "\nmarks: " +marks);
    }
    void greet(){
        System.out.println("Hello! My name is " + this.name);
    }
}
public class Main {
    public static void main(String[] args) {
        // default constructor.
        Student mani = new Student(1,"Manikanta",99.3f); // "new" dynamically allocates memory at run time and return a reference to it.
        Student s1 = new Student(); // initialized to null by default.
        mani.display();
        mani.greet();
        s1.greet();
    }
}
