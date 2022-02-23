class Solution {
    public int maxSubArray(int[] nums) {
        //doing it the naive way
        int maxSum = nums[0];
        int curSum = maxSum; 
        
        for(int i = 1;i<nums.length;i++){
                curSum = Math.max(curSum+nums[i],nums[i]);
                maxSum = Math.max(maxSum, curSum);
            }
        
      return maxSum;
    }
}