package com.codergm.tree;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof TreeNode)) return false;
        return ((TreeNode)obj).getVal() == this.getVal();
    }
}
