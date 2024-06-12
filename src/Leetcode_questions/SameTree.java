package Leetcode_questions;

import Trees.Tree2;

public class SameTree {
    int val;
    SameTree left;
    SameTree right;
    SameTree(){}
    SameTree(int val){
        this.val = val;
    }
   private SameTree root;
   void insert(int value){
      root  = insert(this.root,value);
   }

    private SameTree insert(SameTree node, int value) {
       if(node == null){
           node = new SameTree(value);
           return node;
       }
       node.left = insert(node.left,value);
       node.right = insert(node.right,value);
       return node;
    }
    public void display(){
        display(this.root,"Root Node: ");
    }
    private void display(SameTree node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"left child of "+node.val+" : ");
        display(node.right,"right child of "+node.val+" : ");
    }

    public static void main(String[] args) {
        SameTree tree = new SameTree();
        tree.insert(3);
        tree.display();
        tree.insert(2);
    }

}
