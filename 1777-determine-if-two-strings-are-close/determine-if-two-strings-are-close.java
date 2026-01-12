class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
       
        for(int i = 0 ; i< word1.length(); i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int j = 0 ; j<word2.length(); j++){
            map2.put(word2.charAt(j), map2.getOrDefault(word2.charAt(j),0)+1);
        }
      
       
        if (!map1.keySet().equals(map2.keySet())) return false;

                List<Integer> ans1 = new ArrayList<>(map1.values());
                 List<Integer> ans2 = new ArrayList<>(map2.values());

                 Collections.sort(ans1);
                 Collections.sort(ans2);

                  return ans1.equals(ans2);


    }
}