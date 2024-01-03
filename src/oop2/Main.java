package oop2;

public class Main {
    public static void main(String[] args) {
//            store 5 roll nos
        Student student1 = new Student();
//        student1.marks = 45.4f;
        System.out.println(student1.marks);
        student1.greeting();
        student1.changeName("Goku");
        student1.greeting();
        Student student2 = new Student(12,"john",90.4f);
        System.out.println(student2.rno);
        Student random = new Student(student2);
        System.out.println(random.name);
        Student student3 =new Student();
        System.out.println(student3.name);
    }
}
    class Student{
        int rno;
        String name;
        float marks;
        Student(){
//            calling constructor from another constructor
            this(34,"abc",78.8f);
        }

        Student(Student other){
            this.name = other.name;
            this.marks = other.marks;
            this.rno = other.rno;
        }
//        Student(){
//            this.rno = 13;
//            this.name= "tanish";
//            this.marks=45.9f;
//
//        }
        Student(int rno , String name , float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;

        }
     void greeting(){
         System.out.println("hello this is greeting func "+this.name);
     }
     void changeName(String newName){
            name = newName;
     }
    }
