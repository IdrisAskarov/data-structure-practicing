package com.codergm.demo.tree;

import com.codergm.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CountFullHalfLeafNodesDemo {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, new TreeNode(4), null);
        TreeNode right = new TreeNode(3, new TreeNode(5, new TreeNode(7), null),
                new TreeNode(6, null, new TreeNode(8)));
        TreeNode root = new TreeNode(1, left, right);
        int fullNodesCount = countFullNodes(root);
        System.out.println("fullNodes: " + fullNodesCount);
        int halfNodesCount = countHalfNodes(root);
        System.out.println("halfNodes: " + halfNodesCount);
        int leafNodes = countLeafNodes(root);
        System.out.println("leafNodes: " + leafNodes);

        Map<String, Integer> countNodes = new HashMap<>();
        countNodes.put("fullNodesCount", 0);
        countNodes.put("halfNodesCount", 0);
        countNodes.put("leafNodes", 0);
        countNodesReqursive(root, countNodes);
        System.out.println("count Recursive");
        System.out.println("fullNodes: " + countNodes.get("fullNodesCount"));
        System.out.println("halfNodes: " + countNodes.get("halfNodesCount"));
        System.out.println("leafNodes: " + countNodes.get("leafNodes"));

        countNodes.put("fullNodesCount", 0);
        countNodes.put("halfNodesCount", 0);
        countNodes.put("leafNodes", 0);

        System.out.println("count Iterative");
        countNodesIterative(root, countNodes);
        System.out.println("fullNodes: " + countNodes.get("fullNodesCount"));
        System.out.println("halfNodes: " + countNodes.get("halfNodesCount"));
        System.out.println("leafNodes: " + countNodes.get("leafNodes"));

    }

    private static void countNodesIterative(TreeNode root, Map<String, Integer> countNodes) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode current;
        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.getLeft() != null && current.getRight() != null) {
                countNodes.put("fullNodesCount", countNodes.get("fullNodesCount") + 1);
                queue.add(current.getRight());
                queue.add(current.getLeft());
            } else if (current.getRight() == null && current.getLeft() == null) {
                countNodes.put("leafNodes", countNodes.get("leafNodes") + 1);
            } else {
                countNodes.put("halfNodesCount", countNodes.get("halfNodesCount") + 1);
                queue.add(current.getRight() != null ? current.getRight() : current.getLeft());
            }
        }
    }

    private static void countNodesReqursive(TreeNode root, Map<String, Integer> countNodes) {
        if (root == null) return;

        if (root.getLeft() != null && root.getRight() != null) {
            countNodes.put("fullNodesCount", countNodes.get("fullNodesCount") + 1);
        } else if (root.getRight() == null && root.getLeft() == null) {
            countNodes.put("leafNodes", countNodes.get("leafNodes") + 1);
        } else {
            countNodes.put("halfNodesCount", countNodes.get("halfNodesCount") + 1);
        }
        countNodesReqursive(root.getLeft(), countNodes);
        countNodesReqursive(root.getRight(), countNodes);
    }

    private static int countHalfNodes(TreeNode root) {
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        while (true) {
            while (current != null) {
                queue.offer(current);
                current = current.getLeft();
            }
            if (queue.isEmpty()) break;
            current = queue.remove();
            if ((current.getRight() == null && current.getLeft() != null) ||
                    (current.getRight() != null && current.getLeft() == null)) {
                count++;
            }
            current = current.getRight();
        }
        return count;
    }

    public static int countLeafNodes(TreeNode root) {
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList();
        int count = 0;

        while (true) {
            while (current != null) {
                queue.offer(current);
                current = current.getLeft();
            }
            if (queue.isEmpty()) break;
            current = queue.remove();
            if (current.getLeft() == null && current.getRight() == null) count++;
            current = current.getRight();
        }

        return count;
    }

    public static int countFullNodes(TreeNode root) {
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList();
        int count = 0;
        while (true) {
            while (current != null) {
                queue.offer(current);
                current = current.getLeft();
            }
            if (queue.isEmpty()) break;
            current = queue.remove();
            if (current.getRight() != null && current.getLeft() != null) count++;
            current = current.getRight();
        }
        return count;
    }
}
