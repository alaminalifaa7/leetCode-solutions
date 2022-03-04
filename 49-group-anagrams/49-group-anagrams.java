class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resList = new ArrayList<>();
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i = 0; i<strs.length;i++){
            char[] tempArr = strs[i].toCharArray();
            Arrays.sort(tempArr);
            String sorted = new String(tempArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            
            map.get(sorted).add(strs[i]);
            
        }
        
        resList.addAll(map.values());
        return resList;
    }
}