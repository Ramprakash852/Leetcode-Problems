
import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> pos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            pos.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;

        for (List<Integer> indices : pos.values()) {
            for (int i = 0; i + 2 < indices.size(); i++) {
                ans = Math.min(ans, indices.get(i + 2) - indices.get(i));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans * 2;
    }
}