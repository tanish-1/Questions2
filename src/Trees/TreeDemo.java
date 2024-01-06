package Trees;

public class TreeDemo {
   public class Node{
       private int data;
       private  Node left;
       private Node right;
       Node(int data){
           this.data = data;
       }
    }
    private Node root;
   TreeDemo(){

   }
    void insert(int value){
      root = insert(this.root,value);
    }
   private Node insert(Node node, int value){
       if(node == null){
            node = new Node(value);
           return node;
       }
       if(value < node.data){
           node.left = insert(node.left,value);
       }
       if(value> node.data){
           node.right = insert(node.right,value);
       }
       return node;
    }
    void preOrder(){
       preOrder(this.root);
    }
    private void preOrder(Node node){
       if(node == null){
           return;
       }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(){
       inOrder(this.root);
    }
    private void inOrder(Node node){
       if(node == null){
           return;
       }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    void postOrder(){
       postOrder(this.root);
    }
    private void postOrder(Node node){
       if(node == null){
           return;
       }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }
    void display(){
       display(this.root,"Root Node : ");
    }
    private void display(Node node , String details){
       if(node == null){
           return;
       }
        System.out.println(details+node.data);
       display(node.left,"left child "+ node.data+": ");
       display(node.right,"right child "+ node.data+": ");
    }

    public static void main(String[] args) {
        TreeDemo tree = new TreeDemo();
      tree.insert(5);
      tree.insert(7);
      tree.insert(4);
      tree.display();
    }
}
