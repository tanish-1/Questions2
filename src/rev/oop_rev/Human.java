package rev.oop_rev;

public class Human {
    int age;
    String name;
    boolean married;
 static long population;
    public Human(int age , String name  , boolean married){
        this.age = age;
        this.name = name;
        this.married = married;
        Human.population += 1;
    }
}
