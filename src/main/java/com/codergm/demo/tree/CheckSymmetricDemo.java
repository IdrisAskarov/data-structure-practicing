package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;

public class CheckSymmetricDemo {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1, left, right);
        left.setLeft(new TreeNode(5));
        right.setRight(new TreeNode(5));
        boolean isSymmetric = isSymmetric(root.getLeft(), root.getRight());
        System.out.println("Tree is "+(isSymmetric ? "" : "not")+ " symmetric");
    }

    public static boolean isSymmetric(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;

        if (a != null && b != null) {
            return a.getVal() == b.getVal()
                    && isSymmetric(a.getRight(), b.getLeft())
                    && isSymmetric(a.getLeft(), b.getRight());
        } else {
            return false;
        }
    }
}
