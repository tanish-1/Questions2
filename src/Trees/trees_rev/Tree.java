package Trees.trees_rev;

import Trees.Tree1;

import java.util.Scanner;

public class Tree {
    public class Node{
        private Node left;
        private Node right;
         int data;
        int height;
        Node(int value){
            this.data = value;
        }
    }
        private Node root;
         Tree(){

         }
         void height(){
             System.out.println(height(this.root));
         }
        private int height(Node node){
             if(node == null){
                 return  -1;
             }
             return node.height;
        }
         void insert(int value){
            root = insert(this.root,value);
         }
         private Node insert(Node node , int value){
             if(node == null){
                  node = new Node(value);
                  return node;
             }
             if(value<node.data){
                 node.left = insert(node.left,value);
             }
             if(value>node.data){
                 node.right = insert(node.right,value);
             }
             node.height = Math.max(height(node.left),height(node.right))+1;
             return node;
         }
         void display(){
             display(this.root,"Root Node : ");
         }
         private void display(Node node , String details){
             if(node == null){
                 return;
             }
             System.out.println(details+node.data);
             display(node.left,"Left Node of " + node.data+" : ");
             display(node.right,"Right Node of "+ node.data+" : ");
         }
         void preOrder(){
             preOrder(this.root);
         }
         private void preOrder(Node node){
             if(node == null){
                 return;
             }
             System.out.print(node.data+" ");
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
             System.out.print(node.data+" ");
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
             System.out.print(node.data+" ");
         }
}
