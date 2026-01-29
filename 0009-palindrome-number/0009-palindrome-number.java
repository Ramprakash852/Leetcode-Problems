class Solution {
    public boolean isPalindrome(int x) {
        long a=x;
        if(x<0) return false;
        Integer digit=0;
        while(x>0){
            digit = digit*10+ x%10;
            x=x/10;
        }
        System.out.println(digit);
        if(a==digit) return true;
        return false;
    }
}