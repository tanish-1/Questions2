package staticEg;

public class Main {
    static void hello(){
        System.out.println("hello world");
    }
   void hello2(){
       System.out.println("hello , this year going to be crazy!!!");
   }
   int num;// regular or non-static variable
    static int number;

    // static block which only excuted once when obj is created....
    static {
        number = 56; // static-variable initialization
    }
    public Main(int num){
     this.num = num;
    }
    public static void main(String[] args) {
        hello();// static method don't require instance to created or depend on object
        Main obj = new Main(45);
        obj.hello2(); //Non-static method require instance to created or depend on object
        System.out.println(obj.num); //Non-static variable require instance to created
        System.out.println(Main.number); // static variable  don't require instance to created
    }
}
