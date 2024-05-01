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


 //using recursion - 


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode node, List<Integer>list){
        if(node == null){
            return;
        }
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }
}



//using iteration -

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList<>();
        Stack<TreeNode>stack = new Stack<>();
        TreeNode curr = root;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}