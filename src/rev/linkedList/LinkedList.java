package rev.linkedList;

import java.util.ArrayList;

public class LinkedList {
    private Node head;
    private Node tail;
    void addHead(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if(tail == null){
            tail = head;
        }
    }
    void addTail(int data){
        if(tail == null){
            addHead(data);
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
    void headPop(){
        if (head == null){
           return;
        }
        head = head.next;
        if (head == null){
            tail = null;

        }
    }
    void tailPop(){
            Node current = head;
            if(current.next == null){
                headPop();
                return;
            }
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    void insert(int data, int newdata){
        if (head == null){
            System.out.println("Link is empty dude , why are you inserting!!");
            return;
        }
        if(head.data == data){
            addTail(newdata);
            return;
        }
        Node current = head;
        Node newnode  = new Node(newdata);
        while (current!=null){
            if (current.data == data){
                break;
            }
            current = current.next;
        }
        if(current!=null){
            newnode.next = current.next;
            current.next = newnode;
        } else {
            System.out.println("false : Not Found in this list, dude");
        }
    }
    void insertBefore(int data, int newdata){
        if (head == null){
            System.out.println("Link is empty dude , why are you inserting!!");
            return;
        }
        if(head.data == data){
            addHead(newdata);
            return;
        }
        Node current = head;
        Node newnode  = new Node(newdata);
        while (current.next!=null){
            if (current.next.data == data){
                break;
            }
            current = current.next;
        }
        if(current.next!=null){
            newnode.next = current.next;
            current.next = newnode;
        } else {
            System.out.println("false : Not Found in this list, dude");
        }
    }
     Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node current = head;
        Node newhead = new Node(x);
        Node temp = newhead;
        while(current!=null){
            if(current.data == 1){
                temp.next = newhead;
                newhead = temp;
            } else{
                insertAtEnd(newhead,x);
            }
            current = current.next;

        }
        return newhead;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node current = head;
        Node newnode = new Node(x);
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
        head = newnode;
        return head;
    }
    void deleteNode(int data){
        if(head.data == data){
            headPop();
            return;
        }
        Node current = head;
        while (current!=null){
            if(current.data == data){
                break;
            }
            current = current.next;
        }
        if(current!=null){
            current.next.next = current;



        } else {
            System.out.println("Not found");
        }
    }
    void display(){
        if(head == null){
            System.out.println("Link is empty");
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
        return "LinkedList{head=null, tail=null, list=[]}";
        }

        while (current!=null){
           lst.add(current.data);
            current = current.next;
        }
        return "LinkedList{" +
                "head=" + head.data +
                ", tail=" + tail.data +
                ", list=" + lst +
                '}';
    }


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
