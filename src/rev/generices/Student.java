package rev.generices;

public class Student implements Comparable<Student>{
  public int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        return this.rollno == ((Student)obj).rollno;
    }

    @Override
    public int compareTo(Student obj) {
        int diff = (int)(this.marks - obj.marks) ;
        return diff;
    }
}
