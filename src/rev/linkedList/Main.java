package rev.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addHead(0);
        li.insertBefore(0,-1);
        li.insert(0,1);
        li.insertBefore(1,0);
        li.insert(1,2);
        li.deleteNode(1);
        System.out.println(li);
//        LinkedList newli = new LinkedList();
//        newli.insertAtBeginning(li,5);
    }
}
