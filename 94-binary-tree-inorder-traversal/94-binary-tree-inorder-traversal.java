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
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTrav(root);
        return list;
    }
    public void inorderTrav(TreeNode root)
    {
        if(root!=null)
        {
         inorderTrav(root.left);
        list.add(root.val);
        inorderTrav(root.right);
        }
    }
}