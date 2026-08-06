class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0 ; i<strs.length ; i++){
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String rev = new String(ch);

            while(!map.containsKey(rev)){
                map.put(rev , new ArrayList<>());
            }
            map.get(rev).add(s);
        }

            return new ArrayList<>(map.values());
        
        
    }

}