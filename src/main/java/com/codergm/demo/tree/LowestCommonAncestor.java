package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;
import lombok.val;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        val left = new TreeNode(5);
        val right = new TreeNode(1, new TreeNode(9), new TreeNode(8));
        val root = new TreeNode(3, left, right);
        val leftRight = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        left.setRight(leftRight);
        left.setLeft(new TreeNode(6));
        val result = LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println(result);
        val lowestAncestor = getLowestAncestor(root, new TreeNode(2), new TreeNode(4));
        System.out.println(lowestAncestor.getVal());

    }

    private static TreeNode getLowestAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.equals(p)|| root.equals(q)) {
            return root;
        }
        TreeNode left = getLowestAncestor(root.getLeft(), p, q);
        TreeNode right = getLowestAncestor(root.getRight(), p, q);
        if(left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
