class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();

        StringBuilder ans = new StringBuilder();
        String a ="";

        for(char ch : s.toCharArray()){

            if(ch =='*' ){

                if(!st.isEmpty()){
                st.pop();

                }
                
            }
            else{

            st.add(ch);
            }
        }

        for(char ch : st){
          ans.append(ch);
        }

        return ans.toString();
    }
}