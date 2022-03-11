class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Stack<Integer> stk = new Stack<>();
        stk.push(nums2[nums2.length-1]);
        int [] ans = new int[nums1.length];
        map.put(nums2[nums2.length-1],-1);
        for(int i = nums2.length-2; i>=0; i--){
            
            while(!stk.empty() && stk.peek() <= nums2[i]){
                stk.pop();
            }
            
            if(stk.empty()){
                map.put(nums2[i],-1);
            }else{
                 map.put(nums2[i],stk.peek());
            }
            stk.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}