package rev.string_rev;

import rev.acessControl.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       SubClass obj = new SubClass(23,"hwhw");
        System.out.println(obj.num);
    }
}
