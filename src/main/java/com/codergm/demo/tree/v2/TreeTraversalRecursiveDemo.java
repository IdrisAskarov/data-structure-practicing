package com.codergm.demo.tree.v2;

import com.codergm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class TreeTraversalRecursiveDemo {
    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));
        preorderTraversal(root);
        System.out.println("preorder: " + result);
        result = new ArrayList<>();
        inorderTraversal(root);
        System.out.println("inorder: " + result);
        result = new ArrayList<>();
        postorderTraversal(root);
        System.out.println("postorder" + result);
    }

    private static void preorderTraversal(TreeNode root) {
        if (root != null) {
            result.add(root.getVal());
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }

    private static void inorderTraversal(TreeNode root) {
        if(root != null){
            inorderTraversal(root.getLeft());
            result.add(root.getVal());
            inorderTraversal(root.getRight());
        }
    }

    private static void postorderTraversal(TreeNode root) {
        if (root != null){
            postorderTraversal(root.getLeft());
            postorderTraversal(root.getRight());
            result.add(root.getVal());
        }
    }

}
