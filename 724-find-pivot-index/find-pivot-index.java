class Solution {
    public int pivotIndex(int[] nums) {
        int[] nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];
        nums1[0] = nums[0];
        nums2[nums.length-1] = nums[nums.length-1];
        int ans = -1;


        for(int i = 1 ; i< nums.length ; i++){
            nums1[i] = nums[i] + nums1[i-1];

        }
        System.out.println(Arrays.toString(nums1));
        for(int i = nums.length-2; i>=0 ; i--){
            nums2[i] = nums[i]+nums2[i+1];
        }
          System.out.println(Arrays.toString(nums2));

        for(int i = 0 ; i< nums.length ; i++){
            if(nums1[i] ==nums2[i]){
                return i;
            }
           
        }
        return -1;
    }
}