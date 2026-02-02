class Solution {
    public void sortColors(int[] nums) {
        int beg=0,mid=0,end=nums.length-1;
       while(mid<=end)
       {
           if(nums[mid]==0)
           {
               //swap(nums[beg],nums[mid]);
               int temp = nums[beg];
               nums[beg] = nums[mid];
               nums[mid] = temp; 
               beg++;
               mid++;
           }
           else if (nums[mid]==1)
           mid++;
           else 
           {
               //swap(nums[mid],nums[end]);
               int temp = nums[mid];
               nums[mid] = nums[end];
               nums[end] = temp; 
               end--;
           }
       }
    }
}