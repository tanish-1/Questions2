package rev.acessControl;

public class ObjectClass {
    int n;
    float gpa;

    public ObjectClass(int n,float gpa) {
        this.n = n;
        this.gpa = gpa;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
