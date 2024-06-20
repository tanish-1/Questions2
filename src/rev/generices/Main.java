package rev.generices;

public class Main {
    public static void main(String[] args) {
        Student tanish = new Student(34,89.f);

        Student rahul = new Student(12,90.9f);
        if(tanish.equals(rahul)){
            System.out.println("Equals");
        } else {
            System.out.println("No equals");
        }
        if(tanish.compareTo(rahul)<0){
            System.out.println("Rahul has more marks");
        } else {
            System.out.println("Tanish has more marks");
        }
    }

}
