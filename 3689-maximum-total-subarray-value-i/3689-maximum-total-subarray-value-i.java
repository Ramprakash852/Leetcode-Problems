class Solution {
    public long maxTotalValue(int[] nums, int k) {
       if(nums.length<2){
        return 0;
       } 

       int max_value=Integer.MIN_VALUE,min_value=Integer.MAX_VALUE;    
       for(int num:nums){
        if (num > max_value) {
        max_value = num;
        }
        if (num < min_value){
            min_value=num;
        }
       }
       System.out.println(1L * k *(max_value-min_value));
       return 1L * k * (max_value - min_value);
    }
}