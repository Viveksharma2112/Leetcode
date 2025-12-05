class Solution {
    public int countPartitions(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return 0;
        } else {
            return nums.length - 1;
        }
    }
}
