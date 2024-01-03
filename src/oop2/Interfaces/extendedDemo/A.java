package oop2.Interfaces.extendedDemo;

public interface A {
   default void fun(){
       System.out.println("I am in A");
   }
//   static interface method should always have a body
    static void greeting(){
        System.out.println("Hey I am static method");
    }
}
