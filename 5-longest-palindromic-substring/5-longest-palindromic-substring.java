class Solution {
    public String longestPalindrome(String s) {
        
        String res = "";
        int resLength = 0;
        
        for(int i = 0;i < s.length();i++){
            
            //for odd length
            int l = i;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > resLength){
                    res = s.substring(l,r+1);
                    resLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
            
            //for even length
               l = i;
               r = i+1 ;
            
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > resLength){
                    res = s.substring(l,r+1);
                    resLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
            
        }
        return res;
        
    }
}