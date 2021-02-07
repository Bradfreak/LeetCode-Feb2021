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
    public List<Integer> rec(int lev, List<Integer> ans, TreeNode root){
        if(root == null){
            return(ans);
        }
        if(lev == ans.size()){
            ans.add(root.val);
        }
        ans = rec(lev+1, ans, root.right);
        ans = rec(lev+1, ans, root.left);
        return(ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        list = rec(0, list, root);
        return(list);
    }
}
