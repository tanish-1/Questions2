package rev.oop_rev;

import oop2.Interfaces.Car;

import java.util.Arrays;

public class Main {
   static class Car{
        String name;
        String engine;
         Car(String name){
             this.name = name;
        }
        Car(){

        }
    }
    public static void main(String[] args) {
        Car[] cars  = new Car[3];
        Car bmw = new Car("audi");

        System.out.println(bmw);
        System.out.println(bmw.engine);
        System.out.println(bmw.name);
        System.out.println(Arrays.toString(cars));
    }

}
