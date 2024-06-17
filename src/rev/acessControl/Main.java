package rev.acessControl;

public class Main {
    public static void main(String[] args) {
            A obj = new A(10, "kunal");
            ObjectClass obj2 = new ObjectClass(3,56.8f);
//        System.out.println(obj2);
        ObjectClass obj3 = new ObjectClass(13,78.9f);
        if(obj2==obj3){
            System.out.println("obj2 is equal than obj3");
        }
        if (obj2.equals(obj3)){
            System.out.println("obj2 is equal than obj3");
            Singleton obj4 = Singleton.getInstance();
            System.out.println(obj4);
        }
    }
}
