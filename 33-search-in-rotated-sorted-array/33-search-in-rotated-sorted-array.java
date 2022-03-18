class Solution {
    public int search(int[] nums, int target) {
        //         int l = 0;
//         int r = nums.length - 1;
//         //finding the pivot point/index of the smallest number -- left will hold the index of it
//             while(l < r){
                
//                 int mid = (l + r) / 2;
//                 if(nums[mid] > nums[r]){
//                     l = mid+1;
//                 }else{
//                     r = mid;
//                 }
//             }
        
//         int start = l ;
//         r = nums.length - 1;
//         l = 0;
        
//         if(target >= nums[start] && target <= nums[r]){
//             l = start;
//         }else{
//             r = start;
//         }
        
//         while( l <= r){
//             int mid = (l + r) / 2;
//            if(nums[mid] == target){
//                return mid;
//            }else if(nums[mid] < target){
//                l = mid+1;
//            }else{
//                r = mid-1;
//            }
//         }
//         return -1;
        
        int l = 0;
        int r = nums.length - 1;
        
        while(l <= r){
            int mid = l + (r - l)/2;
            if(target  == nums[mid]){
                return mid;
            }
            
            if(nums[l] <= nums[mid]){
                if(target > nums[mid] || target < nums[l]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }else{
                if(target < nums[mid] || target > nums[r]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
            
        }
        
           return -1; 
//         int start = 0;
//         int end = nums.length - 1;
//         while (start <= end){
//             int mid = (start + end) / 2;
//             if (nums[mid] == target)
//                 return mid;
        
//             if (nums[start] <= nums[mid]){
//                  if (target < nums[mid] && target >= nums[start]) 
//                     end = mid - 1;
//                  else
//                     start = mid + 1;
//             } 
        
//             if (nums[mid] <= nums[end]){
//                 if (target > nums[mid] && target <= nums[end])
//                     start = mid + 1;
//                  else
//                     end = mid - 1;
//             }
//         }
//         return -1;

    }
}