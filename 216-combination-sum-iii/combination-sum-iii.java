class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(result , ans, k , n,1);
        return result;
    }

    public void backtrack(List<List<Integer>>result , List<Integer> ans , int k , int n , int idx ){
        if(ans.size()==k && n==0 ){
            result.add(new ArrayList<>(ans));
            return;
            }
        if (ans.size() > k || n < 0) return;


            for(int i =idx ; i<=9 ; i++){
               ans.add(i);
               backtrack(result, ans , k , n-i,i+1);
               ans.remove(ans.size()-1);


                
            
        }
    }
}
