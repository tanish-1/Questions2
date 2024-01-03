package oop2.Revision.properties.inheritance.generics;

public class MyClass<A extends Number>{

    A data;
//    private static int DEFAULT_SIZE = 8;
    MyClass(){
        this.data = null;
    }
    MyClass(A data){
        this.data = data;
    }
    A func(){
       return  this.data;
    }
}
