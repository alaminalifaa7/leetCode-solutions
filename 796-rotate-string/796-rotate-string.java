class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        s = s.concat(s);
        System.out.println(s);
        if(s.indexOf(goal) != -1){
            return true;
        } else{
            return false;
        }
    }
}