/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // This solution is Correct but not very efficient.
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && max(root.left) >= root.val) {
            return false;
        }
        if(root.right != null && min(root.right) <= root.val) {
            return false;
        }
        if(!isValidBST(root.left) || !isValidBST(root.right)) {
            return false;
        }
        return true;
    }
    
    private int max(TreeNode node) {
        int max = Integer.MIN_VALUE;
        return max(node, max);
    }
    
    private int max(TreeNode node, int max) {
        if(node != null && max < node.val) {
            max = node.val;
        }
        if(node.left != null) max = max(node.left, max);
        if(node.right != null) max = max(node.right, max);
        return max;
    }
    
    private int min(TreeNode node) {
        int min = Integer.MAX_VALUE;
        return min(node, min);
    }
    
    private int min(TreeNode node, int min) {
        if(node != null && min > node.val) {
            min = node.val;
        }
        if(node.left != null) min = min(node.left, min);
        if(node.right != null) min = min(node.right, min);
        return min;
    }
}
