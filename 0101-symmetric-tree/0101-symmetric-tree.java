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
    public boolean ischeck(TreeNode leftroot,TreeNode rightroot){
        if(leftroot==null && rightroot==null){
            return true;
        }else if(leftroot==null){
            return false;
        }else if(rightroot==null){
            return false;
        }
        if(leftroot.val!=rightroot.val){
            return false;
        }
        return ischeck(leftroot.left,rightroot.right) && ischeck(leftroot.right,rightroot.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return ischeck(root.left,root.right);
    }
}