class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int start = 0;

        while (start + k <= nums.length) {

            HashSet<Integer> seen = new HashSet<>();

            for (int i = start; i < start + k; i++) {

                if (!seen.contains(nums[i])) {
                    seen.add(nums[i]);

                    mp.put(
                        nums[i],
                        mp.getOrDefault(nums[i], 0) + 1
                    );
                }
            }

            start++;
        }

        int max = -1;

        for (int num : mp.keySet()) {
            if (mp.get(num) == 1) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
}
