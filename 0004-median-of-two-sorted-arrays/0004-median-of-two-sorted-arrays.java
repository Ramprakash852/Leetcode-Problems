class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      List<Integer>merged=new LinkedList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merged.add(nums1[i]);
                i++;
            }
            else{
                merged.add(nums2[j]);
                j++;
                }
        }
        while(i<nums1.length){
            merged.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            merged.add(nums2[j]);
            j++;
        }
        int n=merged.size();
        double ans;
        if(n%2==0){
            ans = (merged.get(n/2)+merged.get(n/2 -1))/2.0;
        }
        else ans = merged.get(n/2);
        return ans;  
    }
}