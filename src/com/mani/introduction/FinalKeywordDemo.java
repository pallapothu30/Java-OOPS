package com.mani.introduction;

/*

Let’s phrase it clearly:
When you declare a variable as final, it means the reference itself cannot be reassigned to point to a different object.
But if that object is mutable, you can still change its internal state.
A final reference will always refer to the same object it was initialized with,
but the object’s contents can still change unless the class is designed to be immutable.
*/


final class ImmutableBox{
    private final int val;
    ImmutableBox(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }
}


class A{
    int val;
    A(int val){
        this.val = val;
    }
}



public class FinalKeywordDemo {

    public static void main(String[] args) {
        final int a = 10;
        //a = 10; throws error -> final variables cannot be changed.
        final A aa = new A(10);
        /*
           aa = new A(11); throws error -> objects declared final cannot be pointed another reference.
           but value can be changed if they are not declared final.
         */
        aa.val = 11; // value can be changed if they are not declared final.
        System.out.println(aa.val);

        /* Even to make them immutable
        If you want a truly immutable class, you must -
        Mark the class as final (no subclass can break immutability).
        Make all fields private final.
        Provide no setters, only getters.
        Initialize fields only in the constructor.
        */
        final ImmutableBox b = new ImmutableBox(10);
        // b = new ImmutableBox(101); // this is allowed since an object is not declared final but val cannot be changed.
        // b.val = 10; // can only access but cannot modify. declare private so it cannot be accessed.
        // b = new ImmutableBox(11); throws error -> since the object is declared final.
        System.out.println(b.getVal());
    }

}
