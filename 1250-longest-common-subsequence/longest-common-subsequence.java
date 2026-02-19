class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] c1 = text1.toCharArray();
        char [] c2 = text2.toCharArray();
        int[][] res = new int[c1.length+1][c2.length+1];


        int max = 0 ;  

        for(int i = 1 ; i< res.length ; i++){

            for(int j = 1 ; j <res[i].length; j++){

                if(c1[i-1]==c2[j-1]){
                    res[i][j] = 1+ res[i-1][j-1];
                }
                else{
                    res[i][j] = Math.max(res[i][j-1], res[i-1][j]);
                }

                  if(res[i][j] > max){
                                    max = res[i][j];
                                     }
                  }

            }
          
        

           return max;
        
    }
}