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
        if(root == null){
            return 0 ;
        }
        int maxsum = Integer.MIN_VALUE; ; 
        int sum = 0 ; 
        int ls = 1 ; 
        int l = 1;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size(); 
            sum = 0 ; 

            for(int i = 0 ; i< size; i++){
                TreeNode curr = q.poll();
                sum+=curr.val;

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(maxsum < sum){
                maxsum = sum;
                ls = l;
            }
            l++;

            
        }
        return ls ;
        
    }
}