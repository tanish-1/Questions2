package linkedList;

public class List1 {
    private Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    List1(){

    }
    void insertHead(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }
    void insertFromTail(int value){
        if(head == null){
            insertHead(value);
            return;
        }
        Node current = head;
        Node newnode = new Node(value);
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
    }
    void insertSearch(int node,int value){
        if(head.data == value){
            insertFromTail(value);
            return;
        }
        Node current = head;
        Node newnode = new Node(value);
        while (current!=null){
          if(node == current.data){
              break;
          }
            current = current.next;
        }
        if(current!=null){
        newnode.next = current.next;
        current.next = newnode;
        }else {
            System.out.println("false : Not Found in this list, dude");
        }
    }
    void deleteHead(){
        if(head == null){
            return;
        }
        head =head.next;
    }
    void deleteTail(){
        if(head == null){
            return;
        }
        Node current = head;
        if(current.next==null){
            deleteHead();
            return;
        }
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }
    void display(){
        if(head == null){
            System.out.println("Link is empty,Dude....");
            return;
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
