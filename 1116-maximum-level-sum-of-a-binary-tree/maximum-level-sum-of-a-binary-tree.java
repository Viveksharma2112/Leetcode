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
    public int maxLevelSum(TreeNode root) {
        int maxsum = Integer.MIN_VALUE;;
        int ans = 0 ;
        int l = 1 ; 
        int ls = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ans=0;
           
            for(int i = 0 ; i <size ; i++){
                 TreeNode node = q.poll();
                ans += node.val;
                
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
           if(ans>maxsum){
            maxsum= ans;
            ls = l ;
           }
           l++;
        }
        return ls;

        
    }
}