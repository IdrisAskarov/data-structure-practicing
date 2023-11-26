package com.codergm.demo.tree.v2;

import com.codergm.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeTraversalIterativeDemo {
    public static void main(String[] args) {
//        preorder: [1, 2, 4, 5, 3, 6, 7]
//        inorder: [4, 2, 5, 1, 6, 3, 7]
//        postorder[4, 5, 2, 6, 7, 3, 1]

        TreeNode left = new TreeNode(2);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        TreeNode right = new TreeNode(3);
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));
        TreeNode root = new TreeNode(1, left, right);
        List<Integer> result = postorderIterative(root);
        System.out.println(result);


    }
    private static List<Integer> postorderIterative(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        TreeNode previous = null;
        while (true){
            while (current != null){
                stack.push(current);
                current = current.getLeft();
            }
            if(stack.isEmpty()) break;
            while (current == null && !stack.isEmpty()){
                current = stack.peek();
                if (current.getRight() == null || current.getRight() == previous){
                    result.add(current.getVal());
                    stack.pop();
                    previous = current;
                    current = null;
                } else {
                    current = current.getRight();
                }
            }
        }
        return result;
    }
    private static List<Integer> preorderIterative(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (true) {
            while (current != null) {
                result.add(current.getVal());
                stack.push(current);
                current = current.getLeft();
            }
            if (stack.isEmpty()) break;
            current = stack.pop();
            current = current.getRight();
        }
        return result;
    }
    private static List<Integer> inorderIterative(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (true) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            if (stack.isEmpty()) break;
            current = stack.pop();
            result.add(current.getVal());
            current = current.getRight();
        }
        return result;
    }


}
