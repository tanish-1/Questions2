package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.display();
        System.out.println("Size of Stack : " + stack.size());
        stack.peek();
        System.out.println("--------");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Size of Stack : " + stack.size());
        stack.peek();
        System.out.println("Is stack is empty : "+stack.isEmpty());
    }
}
