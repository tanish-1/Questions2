package oop2.randomPackage;
//
public class Main {
    public static void main(String[] args) {
        Human tanish = new Human(20,"tanish ", 10000,false);
        Human kunal = new Human(25,"kunal ", 10000,false);
        Human arpit = new Human(25,"arpit ", 10000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();
    }
    static void fun(){
        System.out.println("heloo");
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("good evening");
    }
}
