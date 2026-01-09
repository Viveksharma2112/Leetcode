class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(result , ans ,nums);
        return result;

        
        
    }
    public void backtrack(List<List<Integer>>result , List<Integer> ans , int[]nums){

        if(ans.size()== nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int num : nums){
            if(ans.contains(num)) continue;
            ans.add(num); 

            backtrack(result , ans , nums);

            ans.remove(ans.size()-1);
        }
    }
}