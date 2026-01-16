class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0 ; 
        int right = nums.length-1;
        Arrays.sort(nums);
        int count = 0 ; 

        while(left < right){

            if(nums[left]+nums[right]==k){
                left++;
                right--;
                count++;
            }

            else if(nums[left]+nums[right]> k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}