class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};

        a[0] = firstocc(nums, target , 0);
        a[1] = last(nums, target , 0);

        return a;
        
    }

    public int firstocc(int[] nums , int target , int i){

        if(i == nums.length){
            return -1;
        }

        if(nums[i]== target){
            return i ;
        }

        return firstocc(nums , target ,i+1);
    }

    public int last(int[] nums , int target , int i ){
        if(i == nums.length ){
            return -1;
        }

        int ans = last(nums, target, i+1);

        if(ans != -1){
            return ans;
        }

        if(nums[i] == target){
            return i ;
        }
        return -1;
    }
}