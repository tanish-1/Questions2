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
//        Car[] cars  = new Car[3];
//        Car bmw = new Car("audi");
//
//        System.out.println(bmw);
//        System.out.println(bmw.engine);
//        System.out.println(bmw.name);
//        System.out.println(Arrays.toString(cars));
//        Human kunal = new Human(22,"kunal",false);
//        System.out.println(Human.population);
//        System.out.println(kunal.age);
        BoxWeight box = new BoxWeight();
        System.out.println(box.h);
        BoxWeight box2 = new BoxWeight();
        Box box3 = new BoxWeight();
        System.out.println(box3.w);
//        BoxWeight box4 = new Box();
//        System.out.println(box4.weight);
    }

}
