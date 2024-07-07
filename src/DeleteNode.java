import rev.linkedList.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeleteNode {
    private Node head;
    private Node tail;
    void inserthead(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if (tail == null){
            tail = head;
        }
    }
    void inserttail(int data){
        if (tail == null){
            inserthead(data);
            return;
        }
        Node newnode = new Node(data);
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
        tail = newnode;
    }
    void deleteNode(int node){
        if (head.data == node){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next!=null){
            if (current.next.data == node){
                break;
            }
            current = current.next;
        }
        if (current.next!=null){
            current.next = current.next.next;
        } else {
            System.out.println("Not found");
        }
    }
    int middleNode(){
        Node current = head;
        Node temp = head;
        while (current!=null && current.next!=null){
            temp = temp.next;
            current = current.next.next;
        }
        return temp.data;
    }
    void reverseLinkedList(){
        Node temp = null;
        Node current = head;

        while (current!=null){
          Node temp2= current.next;
            current.next = temp;
            temp = current;
            current = temp2;
        }

        head = temp;
    }
   void display(){
       HashMap<Node,Integer> map = new HashMap<>();
//       map.containsKey();
        if (head == null){
            System.out.println("link is empty");
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
   }
    @Override
    public String toString() {
          Node current = head;
        ArrayList<Integer> lst = new ArrayList<>();
        if (head == null){
            return "[]";
        }

        while (current!=null){
            lst.add(current.data);
            current = current.next;
        }
        return "{" + lst + '}';
    }

    private static class Node{
        private int data;
       private Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
   DeleteNode lst = new DeleteNode();

   lst.inserttail(1);
   lst.inserttail(2);
   lst.inserttail(3);
   lst.inserttail(4);
   lst.inserttail(5);
        lst.inserttail(6);
        lst.reverseLinkedList();
//   lst.display();
        System.out.println(lst.middleNode());
        System.out.println(lst);
    }
}
