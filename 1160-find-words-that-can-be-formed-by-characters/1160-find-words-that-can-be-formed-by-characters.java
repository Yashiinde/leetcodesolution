class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(String word:words){
            int arr[]=new int[26];
            boolean exist=true;
            for(char ch:word.toCharArray()){
            arr[ch-'a']++;
            if(!map.containsKey(ch) || map.get(ch)<arr[ch-'a']){
                exist=false;
                break;
            }
            }
            if(exist){
                count+=word.length();
            }
        }
        return count;
    }
}