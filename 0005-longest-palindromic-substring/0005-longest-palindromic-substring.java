class Solution {
    public String longestPalindrome(String s) {
        String rev_str = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int count = 0;
        int endIndex = 0;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s.charAt(i - 1) == rev_str.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    int revIndex = n - j;
                    if (revIndex + dp[i][j] - 1 == i - 1) {
                        if (dp[i][j] > count) {
                            count = dp[i][j];
                            endIndex = i - 1;
                        }
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(count);
        return s.substring(endIndex - count + 1, endIndex + 1);
    }
}