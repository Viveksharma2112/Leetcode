class Solution {
    public int countBinarySubstrings(String s) {

      
        int total = 0 ; 
        int prev = 0;
        int curr  = 1 ; 

        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)== s.charAt(i-1)){
                curr++;
            }

            else{
                total += Math.min(prev, curr);
                prev= curr;
                curr = 1;


            }
        }

        total += Math.min(prev, curr);
        return total;
    }
}