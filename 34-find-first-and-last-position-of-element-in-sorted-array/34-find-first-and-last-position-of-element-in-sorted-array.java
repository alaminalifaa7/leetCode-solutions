class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0){
            res[0]=-1;
            res[1]=-1;
            
            return res;
        }
     
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        int last = -1; 
        while(low  <= high){
            int mid = low + (high - low) / 2;
            
            if(target == nums[mid]){
                first = mid;
                high = mid-1;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }else if(target < nums[mid]){
                high = mid-1;
            }
        }
        res[0]=first;
        low = 0;
        high = nums.length-1;
        
        while(low  <= high){
            int mid = low + (high - low) / 2;
            
            if(target == nums[mid]){
                last = mid;
                low = mid+1;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }else if(target < nums[mid]){
                high = mid-1;
            }
        }
        res[1]=last;
        System.out.println(Arrays.toString(res));
        return res;
    }
}