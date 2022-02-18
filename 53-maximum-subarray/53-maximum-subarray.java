class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += nums[i];
            maxSub = Math.max(maxSub,curSum);
        }
        
        return maxSub;
    }
}