class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int n = nums.length;
        int [] ans = new int[nums.length];
        for(int i = 2*n-1; i >=0 ; i--){
            
            while(!stk.empty() && stk.peek() <= nums[i%n]){
                stk.pop();
            }
            
            if(i < n){
                if(stk.empty()){
                    ans[i] = -1;
                }else{
                   ans[i] = stk.peek();
                }
            }
           
            stk.push(nums[i%n]);
        }
        
        return ans;
    }
}