class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0 ; 
        int high = 0 ;
        for(int i = 0 ; i<piles.length ; i++){
            high = Math.max(high,piles[i]);
        }
        int ans = high;

        while(left <= high){
            long hour = 0 ;
              int mid = left +(high-left)/2;

            for(int i = 0 ; i<piles.length; i++){
                hour += Math.ceil((double)piles[i]/mid);
            }
          

            if(hour<=h){
                ans =mid ;
                high = mid-1;

            }
            else{
                left = mid+1;
            }

        }
        return ans;
        
    }
}