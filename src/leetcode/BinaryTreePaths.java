package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, "", list);
        return list;
    }

    private void helper(TreeNode node, String s, List<String> list) {
        if (node == null) {
            return;
        }
        s += node.val;
        if (node.right == null && node.left == null) {
            list.add(s);
            return;
        }
        helper(node.left, s+"->", list);
        helper(node.right, s+"->", list);

    }

}
