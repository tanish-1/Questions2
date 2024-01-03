package oop2.randomPackage;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean marrried) {
        this.age = age;
        this.name =  name;
        this.salary = salary;
        this.married = marrried;
        Human.population +=1;
    }

}
