class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
          List<Integer> ans = new ArrayList<>();

        backtrack(result, ans ,0,candidates,target);
        return result;
        
    }

    public void backtrack(List<List<Integer>>result , List<Integer> ans , int idx , int[] candidate, int rem){

        if(rem < 0)return;


        if(rem ==0){
            result.add(new ArrayList<>(ans));
            return;
        }


        for(int i = idx; i<candidate.length; i++){

            ans.add(candidate[i]);

            
           
        
        backtrack(result, ans , i, candidate, rem-candidate[i]);

        ans.remove(ans.size()-1);


        }

    
    }
}