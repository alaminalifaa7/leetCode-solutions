class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=1;i<=num;i++){
            int sum = 0;
            char[] ch = Integer.toString(i).toCharArray();
            for(int j=0;j<ch.length;j++){
                int digit = Integer.parseInt(String.valueOf(ch[j]));
                sum += digit;
            }
            if(sum %2 == 0){
                count++;
            }
        }
        return count;
    }
}