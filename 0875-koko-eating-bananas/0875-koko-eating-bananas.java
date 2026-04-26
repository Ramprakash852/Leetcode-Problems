class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(piles, mid) <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public long check(int[] piles, int k) {
        long hours = 0;
        for (int p: piles) {
            hours += p/ k;
            if (p % k > 0) hours++;
        }
        return hours;
    }
}