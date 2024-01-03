package oop2.Interfaces;

public class Car implements Engine, Brake,Media{

    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal engine Car");
    }


    @Override
    public void stop() {
        System.out.println("I stop  engine like a normalCar");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal Car");
    }
}
