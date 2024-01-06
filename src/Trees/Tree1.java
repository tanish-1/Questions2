package Trees;

public class Tree1 {


       Tree1 left;
       Tree1 right;
        int data;
        int height;



//    Tree1(int value){
//        root = new Node(value);
//    }
Tree1(int value) {
    this.data = value;
}

    void height() {
        System.out.println(height(this));
    }

    private int height(Tree1 node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        node.height = Math.max(leftHeight, rightHeight) + 1;
        return node.height;
    }

    void display() {
        display(this, "The Root Node: ");
    }

    private void display(Tree1 node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.data + " (Height: " + node.height + ")");
        display(node.left, "The left child of " + node.data + ": ");
        display(node.right, "The right child of " + node.data + ": ");
    }
}