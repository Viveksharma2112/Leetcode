class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums2.length;i++){

            while(!st.isEmpty() &&st.peek()<nums2[i]){
                map.put(st.pop(), nums2[i]);
                
            }

            st.add(nums2[i]);
        }
        int[] res = new int[nums1.length];

        for(int i = 0 ; i<res.length; i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
        
    }
}