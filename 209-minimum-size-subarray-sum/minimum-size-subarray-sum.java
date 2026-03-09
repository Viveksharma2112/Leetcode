class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start = 0 ;
        int minlen = Integer.MAX_VALUE;
        int sum = 0 ;
        

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];


            while(sum >= target){
                
                sum -= nums[start];
               

                minlen = Math.min(minlen , i-start+1);
                 start++;
            }

        }
        if(minlen == Integer.MAX_VALUE){
            return 0 ;
        }
        else{
            return minlen;
        }
        
    }
}