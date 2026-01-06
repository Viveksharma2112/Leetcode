class Solution {
    public int pivotIndex(int[] nums) {
        int[] nums1 = new int[nums.length];
        nums1[0] = nums[0];
        int ans = -1;


        for(int i = 1 ; i< nums.length ; i++){
            nums1[i] = nums[i] + nums1[i-1];

        }
        for(int i = nums.length-2; i>=0 ; i--){
            nums[i] = nums[i]+nums[i+1];
        }

        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] ==nums1[i]){
                return i;
            }
           
        }
        return -1;
    }
}