/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 This solution is fast and efficient than Previous solution i.e. 101.SymmetricTree.java
class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean check(TreeNode node, double min, double max) {
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;
        return check(node.left, min, node.val) && check(node.right, node.val, max);
    }
}
