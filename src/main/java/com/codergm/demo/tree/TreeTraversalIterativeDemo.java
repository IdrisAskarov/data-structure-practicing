package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeTraversalIterativeDemo {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));
        List<Integer> result = postorderTraversal(root);
        System.out.println(result);
    }
//4, 5, 2, 6, 7, 3, 1
    private static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque();
        TreeNode currentNode = root;
        TreeNode previous = null;
        while (true){
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            if(stack.isEmpty())break;
            while (currentNode == null && !stack.isEmpty()) {
                currentNode = stack.peek();
                if (currentNode.getRight() == null || currentNode.getRight() == previous) {
                    result.add(currentNode.getVal());
                    stack.pop();
                    previous = currentNode;
                    currentNode = null;
                } else {
                    currentNode = currentNode.getRight();
                }
            }
        }
        return result;
    }
    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque();
        TreeNode currentNode = root;
        while (true){
            while (currentNode != null){
                result.add(currentNode.getVal());
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            if(stack.isEmpty()){
                break;
            }
            currentNode = stack.pop();
            currentNode = currentNode.getRight();
        }
        return result;
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque();
        TreeNode currentNode = root;
        while (true) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            if (stack.isEmpty()) {
                break;
            }
            currentNode = stack.pop();
            result.add(currentNode.getVal());
            currentNode = currentNode.getRight();
        }
        return result;
    }
}
