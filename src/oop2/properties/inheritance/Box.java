package oop2.properties.inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double side){
//        super(); object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
