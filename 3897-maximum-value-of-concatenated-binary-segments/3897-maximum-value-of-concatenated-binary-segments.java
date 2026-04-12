class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        int n = nums1.length;
        long MOD = 1_000_000_007L;
        
        String[] ans = new String[n];
        

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < nums1[i]; j++) sb.append('1');
            for (int j = 0; j < nums0[i]; j++) sb.append('0');
            ans[i] = sb.toString();
        }
        
        Arrays.sort(ans, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });
        
        long result = 0;
        for (String segment : ans) {
            for (char c : segment.toCharArray()) {
                int bit = c - '0';
                result = (result * 2 + bit) % MOD;
            }
        }
        
        return (int) result;
    }
}