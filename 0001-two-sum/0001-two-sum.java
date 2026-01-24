class Solution {
    public int[] efficent(int[]nums, int target){
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem_sum = target-nums[i];
            if(mp.containsKey(rem_sum)){
                return new int[]{mp.get(rem_sum),i};
            }
            mp.put(nums[i],i);
        }
        return null;
    }
    public int[] twoSum(int[] nums, int target) {
        return efficent(nums,target);
        // for (int i=0;i<nums.length-1;i++)
        // {
        //     for (int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i] + nums[j] == target)
        //         return new int[]{i,j};

        //     }
        // }
        // return new int[0];
    }
}