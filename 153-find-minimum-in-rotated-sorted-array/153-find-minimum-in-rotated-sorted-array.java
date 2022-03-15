class Solution {
    public int findMin(int[] nums) {
        
        // -----------Method 1 -----------
//         int res = nums[0];
//         int l = 0;
//         int r = nums.length -1;
        
//         while(l < r){
//             if(nums[l]<nums[r]){
//                 break;
//             }
//             int mid = (l+r)/2;
        
//             if(nums[mid]>=nums[l]){
//                 l = mid+1;
//             }else{
//                 r= mid;
//             }
            
//         }
        
//         return nums[l];
        
        // -----------Method 2 -----------
        
        int res = Integer.MAX_VALUE;;
        int l = 0;
        int r = nums.length -1;
    
        while(l <= r){
            if(nums[l]<nums[r]){
                res = Math.min(res,nums[l]);
                break;
            }
            int mid = l + (r-l)/2;
            res = Math.min(res,nums[mid]);
            
            if(nums[mid] >= nums[l]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
            
        }
        
         return res; 
        
        
    }
}