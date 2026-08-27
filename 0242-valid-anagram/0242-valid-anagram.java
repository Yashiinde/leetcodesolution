class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> maps=new HashMap<>();
        for(char ch : s.toCharArray()){
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        for(char tc:t.toCharArray()){
            if(maps.containsKey(tc)){
                if(maps.get(tc)==1){
                    maps.remove(tc);
                }else{
                    maps.put(tc,maps.get(tc)-1);
                }
            }else{
                return false;
            }
        }
        return maps.isEmpty();
    }
}