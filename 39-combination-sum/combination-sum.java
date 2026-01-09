class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currsum = new ArrayList<>();
        finalsum(result, currsum, nums, 0,target);
        return result;
        
    }
    public void finalsum(List<List<Integer>> result , List<Integer> currsum ,int[]nums,int idx ,int remtarget){
     if(remtarget <0){
        return;
     }
     if(remtarget ==0){
        result.add(new ArrayList<>(currsum));
        return;
     }
        for(int i = idx ; i<nums.length;i++){
           
            currsum.add(nums[i]);
            finalsum(result,currsum,nums,i,remtarget-nums[i]);
          currsum.remove(currsum.size()-1);

        }
    }
}
