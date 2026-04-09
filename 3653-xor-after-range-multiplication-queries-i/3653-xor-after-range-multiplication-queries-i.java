class Solution {
    private static final int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int num = queries[i][0];
            while(num<=queries[i][1]){
                nums[num]= (int) (((long)nums[num] * queries[i][3]) % MOD);
                num +=queries[i][2];
            }
        }
        int res = 0;
        for (int x : nums) {
            res ^= x;
        }
        return res;
    }
}