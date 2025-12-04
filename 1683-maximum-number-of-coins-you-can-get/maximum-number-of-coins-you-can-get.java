class Solution {
    public int maxCoins(int[] piles) {
     Arrays.sort(piles);
      int left = 0 ; 
      int right = piles.length-1 ; 

      int sum = 0 ; 

      while(left< right){
        right-- ; 
        sum += piles[right];

        left++; 
        right--;
      }
        return sum ; 
        
       }
        
    }
