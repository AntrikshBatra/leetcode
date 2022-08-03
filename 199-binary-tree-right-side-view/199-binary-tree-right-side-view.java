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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<TreeNode> listt=new ArrayList<>();
        printRightView(root,listt,0);
        ArrayList<Integer> ans=new ArrayList<>();
        for(TreeNode curr:listt)
        {
            ans.add(curr.val);
        }
        return ans;
    }
    public void printRightView(TreeNode root,ArrayList<TreeNode> list,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==list.size())
        {
            list.add(root);
        }
        if(list.get(level)!=null)
        {
            list.set(level,root);
        }
        printRightView(root.left,list,level+1);
        printRightView(root.right,list,level+1);
    }
}