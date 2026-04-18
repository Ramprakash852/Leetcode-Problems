class Solution {

    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        int n = nums.length;
        int ans = n + 1;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (seen.containsKey(x)) {
                ans = Math.min(ans, i - seen.get(x));
            }
            seen.put(reverseNum(x), i);
        }

        return ans == n + 1 ? -1 : ans;
    }

    private int reverseNum(int x) {
        int y = 0;
        while (x > 0) {
            y = y * 10 + (x % 10);
            x /= 10;
        }
        return y;
    }
}