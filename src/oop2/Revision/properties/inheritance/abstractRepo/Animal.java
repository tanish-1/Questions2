package oop2.Revision.properties.inheritance.abstractRepo;

abstract class Animal {
     static String species;
     String name;
     static {
         species = "Mammal";
     }
     Animal(){
         this.name = "animal";
     }
     Animal(String name){
         this.name = name;
     }
    abstract void makeSound();
     static void eat(){
         System.out.println("I can eat.");
     }
}
class Cat extends Animal{
    Cat(){
        this.name = "cute animal";
    }
    int age;

     Cat(String name, int age) {
        super(name);
        this.age = age;
    }
    @Override
    void makeSound() {
        System.out.println("meow meow");
    }
    class Dog extends Animal{
        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        void makeSound() {
            System.out.println("Bark Bark");
        }
    }
}