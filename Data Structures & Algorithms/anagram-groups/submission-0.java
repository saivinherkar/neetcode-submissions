class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> hmap = new HashMap<>();
       for(int i=0; i<strs.length; i++){
        
        char[] c = strs[i].toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        
        if(!hmap.containsKey(s)){
            hmap.put(s,new ArrayList<>());
        }
        
        hmap.get(s).add(strs[i]);
       
       } 
    return new ArrayList<>(hmap.values());
    }
}
