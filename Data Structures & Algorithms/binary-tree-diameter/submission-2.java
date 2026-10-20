/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int curr_max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return curr_max;
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        int left=height(root.left);
        int right= height(root.right);

        int total= left+ right;

        curr_max = Math.max(curr_max, total);

        return 1 + Math.max(left, right);
    }
}

