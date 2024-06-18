package rev.abstract_rev;

public class Son2 extends Parent{
    Son2(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I want to be " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + "she is " + age);
    }
}
