class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
     
        for(int i=0;i<accounts.length;i++){
            int curSum = 0;
            for (int j =0;j<accounts[i].length;j++){
                curSum = curSum+accounts[i][j];
                maxSum = Math.max(maxSum, curSum);
            }
        }
        return maxSum;
    }
}