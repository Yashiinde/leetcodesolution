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
    public boolean isidentical(TreeNode node,TreeNode subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.val!=subroot.val){
            return false;
        }
        if(!isidentical(node.left,subroot.left)){
            return false;
        }
        if(!isidentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root==null){
        return false;
       }
       if(isidentical(root,subRoot)){
        return true;
       }
       return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
}
}