class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean neg = false;

        if (x == Integer.MIN_VALUE) return 0;

        if (x < 0) {
            neg = true;
            x = -x;
        }

        while (x > 0) {
            if (ans > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0; 
            }
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return neg ? -ans : ans;
    }
}