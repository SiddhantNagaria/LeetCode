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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length==0)
            return null;
        TreeNode head=helper(num,0,num.length-1);
        return head;
    }
    public TreeNode helper(int[] n, int l, int h){
        if(l>h)
            return null;
        int m=l+(h-l)/2;
        TreeNode node=new TreeNode(n[m]);
        node.left=helper(n,l,m-1);
        node.right=helper(n,m+1,h);
        return node;
    }
}