class Solution {
    public boolean check(int dif, int[]nums, int k){
        int count =0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(nums[right]-nums[left] > dif){
                left++;
            }
            count += right - left;
        }
        return (count >= k);
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int right = nums[nums.length-1];
        while(left < right) {
            int mid = left+(right-left)/2;
            if(check(mid,nums,k)){
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return left;
    }
}