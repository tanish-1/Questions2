package Trees.trees_rev;

public class Main {
    public static void main(String[] args) {
       Tree tree = new Tree();
       tree.insert(6);
       tree.insert(4);
       tree.insert(7);
       tree.insert(3);
       tree.height();
       tree.display();
       tree.preOrder();
        System.out.println();
       tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
