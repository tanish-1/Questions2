package Trees;

public class Tree2 {
    public class Node{
        private Node left;
        private Node right;
        private int value;
        private int height;
        Node(int value){
            this.value = value;
        }

    }
        private Node root;
   Tree2(){

    }
    void height() {
        System.out.println(height(this.root));
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    void insert(int value){
      root = insert(this.root,value);
    }
    private Node insert(Node node, int value){
       if(node == null){
           node = new Node(value);
           return node;
       }
       if(value>node.value){
           node.right = insert(node.right,value);
       }
       if (value<node.value){
           node.left = insert(node.left,value);
       }
       node.height = Math.max(height(node.left),height(node.right))+1;
       return rotate(node);
    }
    private Node rotate(Node node){
       if(height(node.left)-height(node.right)>1){
           if(height(node.left.left) - height(node.left.right)>0){
              return rightRotate(node);
           }
           if(height(node.left.left) - height(node.left.right)<0){
               node.left = leftRotate(node.left);
               return rightRotate(node);
           }
       }
       if(height(node.left)-height(node.right)<-1){
           if(height(node.right.left) - height(node.right.right)<0){
              return leftRotate(node);
           }
           if(height(node.right.left) - height(node.right.right)>0){
               node.right = rightRotate(node.right);
               return leftRotate(node);
           }
       }
       return node;
    }
    Node rightRotate(Node p){
       Node c = p.left;
       Node t = c.right;
       c.right = p;
       p.left = t;
       return c;
    }
    Node leftRotate(Node c){
       Node p = c.right;
       Node t = p.left;
       p.left = c;
       c.right = t;
       return p;
    }
    public void display(){
        display(this.root,"Root Node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"left child of "+node.value+" : ");
        display(node.right,"right child of "+node.value+" : ");
    }
    void preOrder(){
       preOrder(this.root);
    }
    private void preOrder(Node node){
       if(node == null){
           return;
       }
        System.out.println(node.value);
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
       System.out.println(node.value);
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
       System.out.println(node.value);
    }
     void balanced(){
         System.out.println(balanced(this.root));
     }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
}
