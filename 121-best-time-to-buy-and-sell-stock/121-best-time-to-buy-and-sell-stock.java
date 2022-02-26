class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        //this solution gets a TLE
        
        // for(int i =0; i< prices.length;i++){
        //     for(int j = i+1;j<prices.length;j++){
        //         int curProfit = Math.max(maxProfit,(prices[j]-prices[i]));
        //         maxProfit = Math.max(curProfit,maxProfit);
        //     }
        // }
        int left = 0;
        int right = 1;
        
        while (left < right && right < prices.length){
            if(prices[right] >= prices[left]){
                maxProfit  = Math.max(maxProfit,(prices[right] - prices[left]));
                right +=1;
            }else{
                left = right;
                right += 1;
            }
        }
        
        
        return maxProfit;
    }  
}