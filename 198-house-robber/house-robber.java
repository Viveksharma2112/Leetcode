class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // dp[i-1] (pichla max)
        int prev1 = 0; 
        // dp[i-2] (usse pichla max)
        int prev2 = 0; 

        for (int num : nums) {
            // Formula: max(aaj ka paisa + i-2 ka profit,  i-1 ka profit)
            int current = Math.max(prev2 + num, prev1);
            
            // Aage badhne ke liye values shift karein
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}