package Leetcode_questions;

import java.util.*;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class MonuBhaiyaHeight {

    public static int[] treeQueries(int size, int[] queries, int[] levelOrder) {
        int[] heights = new int[size];
        Map<Integer, TreeNode> nodeMap = new HashMap<>();

        // Build the binary tree using level order traversal
        TreeNode root = buildTree(levelOrder, nodeMap);

        // Process each query
        for (int i = 0; i < size; i++) {
            int queryValue = queries[i];
            TreeNode removedNode = nodeMap.get(queryValue);

            // Remove the subtree rooted at the node with the given value
            removeSubtree(root, removedNode);

            // Recalculate the height of the modified tree
            heights[i] = calculateHeight(root);
        }

        return heights;
    }

    // Helper function to build a binary tree from level order traversal
    private static TreeNode buildTree(int[] levelOrder, Map<Integer, TreeNode> nodeMap) {
        TreeNode root = new TreeNode(levelOrder[0]);
        nodeMap.put(root.val, root);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < levelOrder.length; i += 2) {
            TreeNode current = queue.poll();

            if (levelOrder[i] != -1) {
                current.left = new TreeNode(levelOrder[i]);
                nodeMap.put(current.left.val, current.left);
                queue.offer(current.left);
            }

            if (i + 1 < levelOrder.length && levelOrder[i + 1] != -1) {
                current.right = new TreeNode(levelOrder[i + 1]);
                nodeMap.put(current.right.val, current.right);
                queue.offer(current.right);
            }
        }

        return root;
    }

    // Helper function to remove the subtree rooted at a given node
    private static void removeSubtree(TreeNode root, TreeNode target) {
        if (root == null || target == null) {
            return;
        }

        if (root.left == target) {
            root.left = null;
        } else if (root.right == target) {
            root.right = null;
        } else {
            removeSubtree(root.left, target);
            removeSubtree(root.right, target);
        }
    }

    // Helper function to calculate the height of a binary tree
    private static int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of queries array
        int size = scanner.nextInt();

        // Input array of queries
        int[] queries = new int[size];
        for (int i = 0; i < size; i++) {
            queries[i] = scanner.nextInt();
        }

        // Input array of level order traversal
        int[] levelOrder = new int[size * 2];
        for (int i = 0; i < size * 2; i++) {
            levelOrder[i] = scanner.nextInt();
        }

        // Get the array of heights after performing each query
        int[] heights = treeQueries(size, queries, levelOrder);

        // Output the result
        System.out.println(Arrays.toString(heights));
    }
}
