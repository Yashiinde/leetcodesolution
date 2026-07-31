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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean lefttoright=true;
        LinkedList<Integer> level=new LinkedList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                ans.add(level);
                if(q.isEmpty()){
                    break;
                }else{
                    level=new LinkedList<>();
                    lefttoright=!lefttoright;
                    q.add(null);
                }
            }else{
                if(lefttoright){
                    level.addLast(curr.val);
                }else{
                    level.addFirst(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}