package queue;

public class Queue {
    public class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }
        private Node front, rear;
        void enQueue(int value){
            Node node = new Node(value);
            if(this.rear == null){
                this.rear = this.front = node;
                return;
            }

            rear.next = node;
            rear = node;
        }
        void deQueue(){
            if(front == null){
                System.out.println("Queue is empty..");
            }
            front = front.next;
        }
        void frontPeek(){
            if(front == null){
                System.out.println("Queue is empty");
            } else {
                System.out.println(front.data);
            }
        }
        void rearPeek(){
            if(front == null){
                System.out.println("Queue is empty");
            } else {
                System.out.println(rear.data);
            }
        }
        void display(){
            if(front == null){
                System.out.println("Queue is empty...");
            }
            Node current = front;
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
        }

}
