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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet<>();
        boolean ans=ans(root,k,set);
        return ans;
    }
    
    public boolean ans(TreeNode root,int sum,Set<Integer> set)
    {
        if(root==null)
        {
            return false;
        }
        if(ans(root.left,sum,set)==true)
        {
            return true;
        }
        if(set.contains(sum-root.val))
        {
            return true;
        }
        set.add(root.val);
        return ans(root.right,sum,set);
    }
}