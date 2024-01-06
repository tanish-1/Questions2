package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
//        queue.deQueue();
//        queue.deQueue();
//        queue.deQueue();
//        queue.deQueue();
//        queue.deQueue();
        queue.display();
        System.out.println();
        queue.frontPeek();
        queue.rearPeek();
    }
}
