class Solution {
    public int countPartitions(int[] nums) {
       
        int sum = 0 ;
       int newsum = 0 ; 
       int count = 0 ; 

       

        for(int i = 0 ; i< nums.length ; i++){
         sum+=nums[i];

        


        }
        for(int i = 0 ; i<nums.length-1 ; i++){
             newsum += nums[i];
         
            if(((2*newsum)-sum)%2==0){
                count++;
            }
               System.out.println(newsum);
           
            }
        
         return count  ;

    
       
       
    }
}