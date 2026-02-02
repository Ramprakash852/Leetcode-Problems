class Solution {

    private void findsubsets(int []nums,int i,List<List<Integer>>result,List<Integer>subset){
        if(i==nums.length){
            boolean ans =true;
            for(int j=0;j<result.size();j++){
                if(result.get(j)==new ArrayList<>(subset))
                    ans=false;
            }
            if(ans==true)
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        findsubsets(nums,i+1,result,subset);

        subset.remove(subset.size()-1);
        findsubsets(nums,i+1,result,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>subset = new ArrayList<>();
        findsubsets(nums,0,result,subset);
        return result;
    }
}