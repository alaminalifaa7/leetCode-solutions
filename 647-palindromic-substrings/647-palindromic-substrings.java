class Solution {
    public int countSubstrings(String s) {
        String res = "";
        int count = 0;
        
        for(int  i = 0 ; i < s.length(); i++){
            
            int l = i;
            int r = i;
            // System.out.println("for loop->  i-> "+i +" le-> "+ l +"r-> "+ r);
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ){
                count++;
                res = s.substring(l,r+1);
                // System.out.println("odd-length->  "+res);
                // System.out.println("before expanding odd->  i-> "+i +" le-> "+ l +"r-> "+ r);
                l -= 1;
                r += 1;
            }
            l = i;
            r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ){
                count++;
                res = s.substring(l,r+1);
                // System.out.println("even-length->  "+res);
                // System.out.println("before expanding even->  i-> "+i +" le-> "+ l +"r-> "+ r);
                l -= 1;
                r += 1;
            }
        }
        return count;
    }
}