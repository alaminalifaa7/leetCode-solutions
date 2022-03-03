class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        char[] ch=s.toCharArray(); 
        char[] ch1=t.toCharArray(); 
        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                 map.put(ch[i], 1);
            }else{
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        
        }
        for(int i=0;i<ch1.length;i++){
          if (map.containsKey(ch1[i])) {
           
                map.put(ch1[i],
                        map.get(ch1[i]) - 1);
            }
        }
         Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
}