package rev.abstract_rev;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
    }
    abstract void career(String name);
    abstract void partner(String name, int age);
}
