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
    public boolean isSymmetric(TreeNode root) {
      return  isSymm(root.right,root.left);
    }
    public boolean isSymm(TreeNode right,TreeNode left)
    {
        if(right==null && left==null)
        {
            return true;
        }
        if(right==null || left==null)
        {
            return false;
        }
        
        return right.val==left.val && isSymm(right.left,left.right) && isSymm(right.right,left.left);
    }
}