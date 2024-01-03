package oop2.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son1 son1 = new Son1(30);
        son1.career();

        Son2 son2 = new Son2(34);
        son2.career();
        Parent.hello();
        son1.normal();
    }
}
