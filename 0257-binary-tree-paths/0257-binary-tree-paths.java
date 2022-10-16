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
    List<String> list = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        dfs(root,s);
        return list;
    }
    public void dfs(TreeNode root, String s){
        if(root!=null){
            if(root.left==null && root.right==null){
                list.add(s+root.val);
            }
            dfs(root.left,s+root.val+"->");
            dfs(root.right,s+root.val+"->");
        }
    }
}