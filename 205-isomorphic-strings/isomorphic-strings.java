class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> set1 = new HashMap<>();
        Map<Character,Character> set2 = new HashMap<>();

        for(int i= 0 ; i <s.length(); i++){
            char c1 = s.charAt(i); 
            char c2 = t.charAt(i);

            if(set1.containsKey(c1)){
                if(set1.get(c1)!=c2){
                    return false;
                }
                
            }
            set1.put(c1,c2);
              if(set2.containsKey(c2)){
                if(set2.get(c2)!=c1){
                    return false;
                }
               
            }
             set2.put(c2,c1);
        }
        return true;

    }
}