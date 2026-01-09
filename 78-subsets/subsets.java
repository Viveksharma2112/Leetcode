class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(result , ans , 0 , nums);
        return result;
    }
    public void backtrack(List<List<Integer>>result , List<Integer> ans ,int start , int[]nums){
        result.add(new ArrayList<>(ans));

        for(int i = start; i<nums.length;i++){
           ans.add(nums[i]);
           backtrack(result, ans , i+1, nums);

           ans.remove(ans.size()-1);
        }
    }
}