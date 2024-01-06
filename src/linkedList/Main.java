package linkedList;

public class Main {
    public static void main(String[] args) {
        List1 list = new List1();
        list.insertHead(2);
        list.insertHead(1);
        list.insertHead(0);
        list.insertFromTail(3);
        list.insertSearch(2,4);
        list.display();
        list.deleteTail();
        list.deleteTail();
        list.deleteTail();
        list.deleteTail();
        list.deleteTail();
        System.out.println();
        list.display();

    }
}
