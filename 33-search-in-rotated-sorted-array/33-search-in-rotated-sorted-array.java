class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;
        //finding the pivot point/index of the smallest number -- left will hold the index of it
            while(l < r){
                
                int mid = (l + r) / 2;
                if(nums[mid] > nums[r]){
                    l = mid+1;
                }else{
                    r = mid;
                }
            }
        
        int start = l ;
        r = nums.length - 1;
        l = 0;
        
        if(target >= nums[start] && target <= nums[r]){
            l = start;
        }else{
            r = start;
        }
        
        while( l <= r){
            int mid = (l + r) / 2;
           if(nums[mid] == target){
               return mid;
           }else if(nums[mid] < target){
               l = mid+1;
           }else{
               r = mid-1;
           }
        }
        return -1;
    }
}