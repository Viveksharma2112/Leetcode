class Solution {
    public int longestConsecutive(int[] nums) {
        

        HashSet<Integer> map = new HashSet<>();
        int longest =  0 ;
        for(int num : nums){
            map.add(num);
        }

        for(int num : map){
            if(!map.contains(num-1)){
                int curr = num ; 
                int len = 1;
            
            while(map.contains(curr+1)){
                curr++;
                len++;
            }
            
            longest = Math.max(longest,len);
            
        }
        }
        return longest;
    }
}