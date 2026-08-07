class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }
        int lng = 0 ;

        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num ; 
                int len = 1;
            

            while(set.contains(curr+1)){
                curr++;
                len++;
                
            }
            lng = Math.max(lng,len);
        }

        }
        return lng;
        
    }
}