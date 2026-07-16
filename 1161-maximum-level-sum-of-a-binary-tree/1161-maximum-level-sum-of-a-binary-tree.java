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
    public int maxLevelSum(TreeNode root) {
      if(root==null){
        return 0;
      }
      Queue<TreeNode> q= new LinkedList<>();
      q.add(root);
      q.add(null);
      int max= Integer.MIN_VALUE;
      int level=0;
      int sum=0;
      int count=0;
      while(!q.isEmpty()){
        TreeNode curr= q.remove();
        if(curr==null){
            count++;
            if(max<sum){
                max=sum;
                level=count;
            }
            if(q.isEmpty()){
                break;
            }else{
                sum=0;
                q.add(null);
            }
        }else{
            sum+=curr.val;
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
      } 
      return level; 
    }
}