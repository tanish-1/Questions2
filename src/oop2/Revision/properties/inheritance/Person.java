package oop2.Revision.properties.inheritance;

public class Person extends Human{
    String name;
    int age;
    String occupation;
    Person(){
        this.name = null;
        this.age = 0;
        this.occupation = null;
    }

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    void aboutYou(){
        System.out.println("You are " + this.name + ", you are "+ this.age+" year old "+ "your occupation is " + this.occupation);
    }
}
