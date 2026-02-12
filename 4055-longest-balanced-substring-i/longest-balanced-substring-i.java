class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            
            int[] freq = new int[26]; 
            
            for (int j = i; j < n; j++) {
                
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                if (isBalanced(freq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    private boolean isBalanced(int[] freq) {
        int commonCount = -1; 
        
        for (int f : freq) {
            if (f > 0) { 
                if (commonCount == -1) {
                    commonCount = f; 
                } else if (commonCount != f) {
                    return false;
                }
            }
        }
        return true; 
    }
}