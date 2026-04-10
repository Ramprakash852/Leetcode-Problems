class Solution {
    public int largestAltitude(int[] gain) {
        int currAltitute = 0;
        int highestAltitute = currAltitute;
        for(int it: gain){
            currAltitute += it;
            highestAltitute = Math.max(currAltitute, highestAltitute);
        }
        return highestAltitute;
    }
}