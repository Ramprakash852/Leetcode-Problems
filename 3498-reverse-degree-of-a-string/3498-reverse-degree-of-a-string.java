class Solution {
    public int reverseDegree(String s) {
        int deg = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int rev = ('z'- ch)+1;
            deg += rev * (i + 1);
        }
        return deg;
    }
}