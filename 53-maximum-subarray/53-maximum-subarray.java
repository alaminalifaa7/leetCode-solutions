class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = maxSub;
        
        for(int i = 1; i < nums.length; i++){
           
            curSum = Math.max(curSum + nums[i],nums[i]);
            maxSub = Math.max(maxSub,curSum);
        }
        
        return maxSub;
    }
}