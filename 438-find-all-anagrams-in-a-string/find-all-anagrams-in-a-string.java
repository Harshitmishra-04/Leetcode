class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        if (s.length() < p.length()) return arr;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        int len = p.length();
        int left = 0;
        
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            map2.put(curr, map2.getOrDefault(curr, 0) + 1);

            if(right - left + 1 > len){
                char l = s.charAt(left);
                map2.put(l, map2.getOrDefault(l, 0) - 1);
                
                if(map2.get(l) == 0){
                    map2.remove(l);
                }
                
                left++;
            }
            if(right - left + 1 == len){
                if(map2.equals(map)){
                    arr.add(left);
                }
            }
        }
        return arr;
    }
}
