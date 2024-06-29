package rev.linkedList;

public class Index {
    private Node head;
    private Node tail;
    void addhead(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if(tail == null){
            tail = head;
        }
    }
    void addtail(int data){
        if(tail == null){
           addhead(data);
           return;
        }
        Node current = head;
        Node newnode = new Node(data);
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
        tail = newnode;
    }
    void deleteHead(){
        if (head == null){
            return;
        }

        head=head.next;
    }
    void deleteTail(){
         if (tail == null){
             return;
         }
        Node current = head;
        if (current.next == null){
            deleteHead();
            return;
        }
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }
    void insertElementAfter(int data, int insert){
        Node current = head;
        Node newnode = new Node(insert);
        while (current!=null){
            if(current.data == data){
                break;
            }
            current = current.next;
        }
        if (current!=null){
            newnode.next = current.next;
            current.next = newnode;
        } else {
            System.out.println("not found");
        }
    }
    void traverse(){
        if(head == null){
            System.out.println("link is empty");
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    private class Node{
        int data;
        Node next;
       public Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
      Index li = new Index();
     li.addtail(2);
     li.addtail(3);
      li.traverse();
//      li.deleteTail();
//        li.deleteTail();
        System.out.println();
//      li.traverse();
      li.insertElementAfter(3,9);
      li.traverse();
    }
}
