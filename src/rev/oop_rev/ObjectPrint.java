package rev.oop_rev;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(34);
        System.out.println(obj);
    }
}
