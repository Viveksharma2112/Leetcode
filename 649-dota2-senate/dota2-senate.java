class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n= senate.length();

        for(int i = 0 ; i < senate.length() ; i++){
            if(senate.charAt(i)=='R'){
                r.add(i);
            }
            else{
                d.add(i);
            }
        }
        while(!r.isEmpty()&& !d.isEmpty()){
            int R = r.poll();
            int D = d.poll();

            if(R<D){
                r.add(R+n);

            }
            else{
                d.add(D+n);
            }
        }
       return r.isEmpty() ? "Dire" : "Radiant";


          
    }
}