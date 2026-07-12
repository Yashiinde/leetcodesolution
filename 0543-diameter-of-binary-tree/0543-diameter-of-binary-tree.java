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
    static class info{
        int diam;
        int ht;

        info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public info diameter(TreeNode root){
        if(root==null){
            return new info(0,0);
        }
        info leftinfo=diameter(root.left);
        info rightinfo=diameter(root.right);

        int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new info(diam,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam-1;
    }
}