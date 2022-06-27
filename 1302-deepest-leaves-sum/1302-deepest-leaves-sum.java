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
    private int maxDepth;
    
    public int deepestLeavesSum(TreeNode root) {
        this.maxDepth = 0;
        dfsGetMaxDepth(0, root);
        return getDeepestLeavesSum(0, root);
    }
    
    public void dfsGetMaxDepth(int depth, TreeNode curr) {
        if (curr == null) {
            return;
        }
        if (curr.left == null && curr.right == null) {
            if (this.maxDepth < depth){
                this.maxDepth = depth;
            }
            return;
        }
        dfsGetMaxDepth(depth+1,curr.left);
        dfsGetMaxDepth(depth+1,curr.right);
        return;
    }
    
    public int getDeepestLeavesSum(int currDepth, TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        if (currDepth == this.maxDepth) {
            return curr.val;
        }
        return getDeepestLeavesSum(currDepth+1, curr.left) + getDeepestLeavesSum(currDepth+1, curr.right);
    }
}