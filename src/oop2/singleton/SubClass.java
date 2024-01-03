package oop2.singleton;

import oop2.accessControl.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45,"tanish");
        int n = obj.num;
    }
}
