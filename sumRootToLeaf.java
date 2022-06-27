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

//TC:  O(n) sc O(H)
     int result=0;
    public int sumNumbers(TreeNode root) {
       
        if(root==null)return 0;
        dfs(root,0);
        return result;
        
        
    }
    void dfs(TreeNode root, int value){
        
        if(root==null)return;
        
        //finding current sum
        int currSum=10*value+root.val;
        
        //add current sum to result if reached end of tree 
        if(root.left==null&&root.right==null){
            result+=currSum;
            return;    
        }
        dfs(root.left,currSum);
        dfs(root.right,currSum);
        
        
        
        
    }
}
