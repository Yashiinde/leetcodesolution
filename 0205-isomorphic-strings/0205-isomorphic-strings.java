class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
        
            if(map.containsKey(ch)){
                if(map.get(ch)!=ch2){
                    return false;
                }
            }else{
                if(set.contains(ch2)){
                    return false;
                }
                map.put(ch,ch2);
                set.add(ch2);
            }
        }
        return true;
    }
}