class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> h_set = new HashSet<Character>();
    
        int i = 0;
        int j = 0;
        int res = 0;
        while(j < s.length()){
            if(!h_set.contains(s.charAt(j))){
                h_set.add(s.charAt(j));
                j++;
                res = Math.max(h_set.size(),res);
            }else{
                h_set.remove(s.charAt(i));
                i++;
            }
        }
        
        return res;
         
    }
}