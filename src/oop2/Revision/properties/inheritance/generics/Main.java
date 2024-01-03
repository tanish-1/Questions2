package oop2.Revision.properties.inheritance.generics;

public class Main {
    public static void main(String[] args) {
        MyClass<Number> num = new MyClass<>(9.4f);
        System.out.println(num.data);
    }
}
