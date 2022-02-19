class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
            int minHeight = Math.min(height[left],height[right]);
            int area = minHeight * (Math.abs(right-left));
            max = Math.max(area,max);
            
            if(height[left] < height[right]){
                left += 1;
            }else{
                right -= 1 ;
            }
            
        }
        
        return max;
        
    }
}