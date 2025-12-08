class Solution {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        int left = 0; 

        for (int i = 0; i < n;) {
            int x = nums[i];
            int freq = 0;

            while (i < n && nums[i] == x) {
                i++;
                freq++;
            }

            int right = n - i;

            count += left * freq * right;

            left += freq;
        }

        return count;
    }
}
