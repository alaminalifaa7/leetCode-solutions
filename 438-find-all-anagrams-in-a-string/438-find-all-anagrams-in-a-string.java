class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
     int i = 0;
        int j = 0;
        List<Integer> resList = new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int k = p.length();
         int count=0;
        for(char c: p.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
                count++;
            }else{
                map.put(c,map.get(c)+1);
            }
        }
       
       List<Character> charList = new ArrayList<>();
        while(j<s.length()){
             HashMap<Character, Integer> shallowMap = new HashMap<Character, Integer>(map);
            charList.add(s.charAt(j));
           // System.out.println("j ->"+j);
           // System.out.println("charList ->"+Arrays.toString(charList.toArray()));
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j)) == 0){
                   // System.out.println(count);
                    count -= 1;
                   // System.out.println(count);
                }
            }
            
            if(j - i + 1 < k){
                j++;
            }else if( j - i + 1 == k){
                if(count == 0 ){
                    resList.add(i);
                  //  System.out.println("resList ->"+Arrays.toString(resList.toArray()));
                }
                
                
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1)
                        count++;
                }
                charList.remove(0);
                i++;
                j++;
            }
        }
        return resList;
        
    }
}