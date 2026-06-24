class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for(String s  : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String rev = new String(ch);

            if(!map.containsKey(rev)){
                map.put(rev, new ArrayList<>());

            }
            map.get(rev).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}