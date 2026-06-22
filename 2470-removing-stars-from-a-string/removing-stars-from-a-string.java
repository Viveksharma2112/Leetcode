class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();

        String a ="";

        for(char ch : s.toCharArray()){

            if(ch =='*' && !st.isEmpty()){

                   st.pop();    
                  }
            else{

            st.add(ch);
            }
        }

        for(char ch : st){
          a +=ch;
        }

        return a;
    }
}