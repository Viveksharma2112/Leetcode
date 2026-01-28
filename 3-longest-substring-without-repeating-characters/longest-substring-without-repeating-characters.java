class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ,len = 0 ; 
        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
               
                set.remove(s.charAt(start));
                 start++;
            }
            set.add(ch);
            len = Math.max(len , i-start+1);
        }
        return len;
        
    }
}