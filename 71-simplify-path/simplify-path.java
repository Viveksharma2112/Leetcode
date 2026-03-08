class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] ans = path.split("/");


            for(String ch : ans){
                if(ch.equals(".") || ch.isEmpty()){
                    continue;
                }
            
                else if(ch.equals("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }

                    else{
                        st.push(ch);
                    }

                }


        StringBuilder sb = new StringBuilder();

        for(String s : st){

            sb.append('/').append(s);
        }


        if(sb.length() > 0){
            return sb.toString();
        }
        else{
            return "/";
        }
        
             
        }
        
    
}