package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalRecursiveDemo {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1,left,right);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));

        result = preorderTraversal(root);
        System.out.println(result);
    }
//4, 2, 5, 1, 6, 3, 7
    private static List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            result.add(root.getVal());
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
        return result;
    }
}
