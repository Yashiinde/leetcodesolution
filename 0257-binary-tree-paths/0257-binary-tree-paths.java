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
    public void binary(List<String>list,TreeNode root,StringBuilder str){
        if(root==null){
            return;
        }   
        int len=str.length();
        if(len>0){
            str.append("->");
        }   
            str.append(root.val);
            if(root.left==null && root.right==null){
                list.add(str.toString());
            
            }
           else{
            binary(list,root.left,str);
            binary(list,root.right,str);
           }
            str.setLength(len);


    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
       
        StringBuilder str=new StringBuilder("");
        binary(list,root,str);
        return list;
    }
}