package oop2.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student tanish = new Student(12,99.96f);
        Student rohit = new Student(34,91.5f);
        if(tanish.compareTo(rohit)<0){
            System.out.println(tanish.compareTo(rohit));
            System.out.println("Rohit has more marks");
        } else if(tanish.compareTo(rohit)>0) {
            System.out.println("Tanish has more marks");
        }
    }
}
