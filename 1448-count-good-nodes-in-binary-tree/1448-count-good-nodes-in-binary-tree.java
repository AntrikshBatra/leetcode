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
    int count =0;
    public int goodNodes(TreeNode root) {
        helper(root,root.val);
        return count;
    }
    private void helper(TreeNode root,int max)
    {
        if(root!=null)
        {
            if(root.val>=max)
            {
                max=root.val;
                count++;
            }
            helper(root.left,max);
            helper(root.right,max);
        }
        
    }
}