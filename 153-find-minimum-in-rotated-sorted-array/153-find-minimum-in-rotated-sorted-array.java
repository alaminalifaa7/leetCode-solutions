class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        int l = 0;
        int r = nums.length -1;
        
        while(l < r){
            if(nums[l]<nums[r]){
                res = nums[l];
                break;
            }
            int mid = (l+r)/2;
        
            if(nums[mid]>=nums[l]){
                l = mid+1;
            }else{
                r= mid;
            }
            
        }
        
        return nums[l];
    }
}