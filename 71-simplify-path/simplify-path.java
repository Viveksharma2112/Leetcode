class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] component = path.split("/");

     for(String comp : component){
        if(comp.equals(".") || comp.isEmpty()){
            continue;
        }

        else if(comp.equals(".." )){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else{
            st.push(comp);
        }
     }
     StringBuilder sb = new StringBuilder() ; 

     for(String s : st){
        sb.append("/").append(s);

     }

     if(sb.length()>0){
        return sb.toString();
     }
     else{
        return "/";
     }


        
    }
}