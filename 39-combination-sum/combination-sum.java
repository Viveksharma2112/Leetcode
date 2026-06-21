class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(res, ans , candidates,0 , target);
        return res;
        
    }
    public void backtrack(List<List<Integer>>res , List<Integer> ans , int[] nums , int idx , int rem){

        if(rem <0){
            return ;
        }
        if(rem == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = idx; i <nums.length ; i++){
            ans.add(nums[i]);
            backtrack(res, ans , nums , i,rem-nums[i]);
            ans.remove(ans.size()-1);
        }
    }
}