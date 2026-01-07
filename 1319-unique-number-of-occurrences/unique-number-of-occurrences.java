class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int n : map.values()){
            if(!set.add(n)){
                return false;
            }
          
        }
        return true;
        
    }
}