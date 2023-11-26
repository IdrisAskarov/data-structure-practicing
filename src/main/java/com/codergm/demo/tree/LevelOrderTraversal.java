package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.setRight(new TreeNode(4, new TreeNode(6), new TreeNode(7)));
        right.setLeft(new TreeNode(5, null, new TreeNode(8)));
        List<Integer> result = levelOrderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> levelOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode current = queue.remove();
                result.add(current.getVal());
                if (current.getLeft() != null) queue.add(current.getLeft());
                if (current.getRight() != null) queue.add(current.getRight());
            }
        }
        return result;
    }
}
