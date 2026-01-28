class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax[] = new int [n];
        int rightmax[] = new int [n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        int j=n-2;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            rightmax[j]=Math.max(height[j],rightmax[j+1]);
            j--;
        }
        int totalwater = 0;
        int water;
        for(int i=0;i<n;i++){
            water = Math.min(leftmax[i],rightmax[i]);
            totalwater += water-height[i];
        }
        return totalwater;
    }
}