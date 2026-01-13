class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] c1 = text1.toCharArray();
        char[] c2 =text2.toCharArray(); 
        int max=0 ; 
        int[][] ans = new int[c1.length+1][c2.length+1];

        for(int i = 1; i< ans.length ; i++){
            for(int j = 1 ;j<ans[i].length;j++){

                if(c1[i-1]==c2[j-1]){
                    ans[i][j] = ans[i-1][j-1]+1;

                }
                else{
                    ans[i][j] = Math.max(ans[i][j-1], ans[i-1][j]);
                }

                if(ans[i][j] > max){
                    max = ans[i][j];
                }
            }
        }
        return max;
    }
}