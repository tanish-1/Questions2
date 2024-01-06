package stack;

public class Stack {
    public class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }
        private int size;
    private Node top;
    void push(int value){
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
        size+=1;
    }
    void peek(){
        if(top == null){
            System.out.println("Stack is empty...");
        } else {

        System.out.println(top.data);
        }
    }
    void pop(){
        top = top.next;
        size--;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return top == null;
    }
    void display(){
        if(top == null) {
            System.out.println("Stack is empty...");
        }
            Node current = top;
            while (current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

