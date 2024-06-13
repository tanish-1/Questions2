package rev.oop_rev;



public class Box {
    double l;
    double h;
    double w;

    Box(){
        this(-1,-1,-1);
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l , double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    void information(){
        System.out.println("Running the box");
    }



public static void main(String[] args) {
    Box box = new Box(4,7,8);
        Box box2 = new Box(box);
        System.out.println(box2.h);
}
}
