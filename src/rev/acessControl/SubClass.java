package rev.acessControl;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       A obj = new SubClass(23,"hwhw");
        System.out.println(obj.num);
    }
}
