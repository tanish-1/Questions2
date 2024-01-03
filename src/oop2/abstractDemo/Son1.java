package oop2.abstractDemo;

public class Son1 extends Parent{
    public Son1(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be World Leader ");
    }

    @Override
    void partner() {
        System.out.println("This is secret her name starts with R");
    }
}
