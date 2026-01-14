class Solution {
    public int countTriples(int n) {
        int count = 0 ; 

        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < n ;j++ ){
               int c2 = i*i + j*j ; 
               int c =(int)Math.sqrt(c2);

               if(c2 == c*c && c<=n){
                count ++;
               }
            }
        }
        return count ;
        
    }
}