class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;

        for(int i = 1; i< gain.length ; i++){
            gain[i] = gain[i]+gain[i-1];
        }
        for(int  i = 0 ; i< gain.length; i++){
            if(gain[i] > max){
                max=gain[i];
            }

        }
       if(max<0){
        return 0 ; 
       }
       else{
        return max;
       }
    }
}