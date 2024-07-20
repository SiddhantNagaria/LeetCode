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
    int counter = 0;
    int out = 0;
    public int kthSmallest(TreeNode root, int k) {
        recursion(root, k);
        return out;
    }
    public void recursion(TreeNode node , int k){
        if(node.left!=null){
            recursion(node.left, k);
        }
        counter++;
        if(counter==k){
            out = node.val;
            return;
        }
        if(node.right!=null){
            recursion(node.right, k);
        }
    }
}