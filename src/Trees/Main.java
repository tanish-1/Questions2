package Trees;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {5,7,8,9,10,3};
//        TreeDemo tree = new TreeDemo();
//        tree.populate(arr);
//        tree.insert(5);
//        tree.insert(6);
//        tree.insert();
//        tree.display();
//        tree.preOrder();
//        AVLTree tree1 = new AVLTree();
//        for (int i = 0 ; i<1000 ; i++){
//            tree1.insert(i);
//        }
//        System.out.println(tree1.height());
//      Tree1 tree = new Tree1(6);
//     tree.left = new Tree1(5);
//     tree.right = new Tree1(7);
//     tree.right.right = new Tree1(8);
//     tree.right.right.right = new Tree1(9);
//        tree.display();
        Tree2 tree = new Tree2();
        tree.insert(14);
        tree.insert(17);
        tree.insert(11);
        tree.insert(7);
        tree.insert(53);
        tree.insert(4);
        tree.insert(13);

        tree.display();
       tree.balanced();

//        System.out.println(tree.height);
    }
}
