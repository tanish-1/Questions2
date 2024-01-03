package oop2.abstractDemo;

public class Son2 extends Parent{
    public Son2(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be Coder");
    }

    @Override
    void partner() {
        System.out.println("This is also secret her name starts with P");
    }
}
