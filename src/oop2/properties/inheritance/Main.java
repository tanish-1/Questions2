package oop2.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,6,4);
//        Box box2 = new Box(box);
//        System.out.println(box.l + " "+ box.h+" "+ box.w);
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h+" "+ box3.weight);
        //error
//         BoxWeight box5 = new Box(2,3,4);
//        System.out.println(box5.l+" "+box5.weight);
        //error
//         Box box6 = new BoxWeight(2,3,4);
//        System.out.println(box5.l+" "+box5.weight);
        BoxPrice box = new BoxPrice(5,8,200);
        Box box3 = new Box();

    }
}
