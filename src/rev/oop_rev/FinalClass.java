package rev.oop_rev;

public class FinalClass {
    static class Phone{
        String BRAND;
        int cost;
        String color;
        Phone(String brand , int cost , String color){
            this.BRAND = brand;
            this.cost = cost;
            this.color = color;
        }
        Phone(){
            this("Phone",0,null);
        }

    }
    public static void main(String[] args) {
         Phone samsung = new Phone();
        System.out.println(samsung.color);
        final float PI = 3.14f;

        System.out.println(PI);
    }
}
