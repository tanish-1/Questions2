package oop2.properties.inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Shapes square = new Square();

        square.area();
    }
}
