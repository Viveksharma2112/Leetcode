class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();

        for(int i = 0 ; i<nums.length ; i++){
            if(ans.size() < k){
                ans.add(nums[i]);
            }
            else{
                if(ans.peek() < nums[i]){
                    ans.remove(ans.peek());
                    ans.add(nums[i]);
                }
            }
        }
        return ans.peek();
    }
}