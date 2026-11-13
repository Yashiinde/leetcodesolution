class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map= new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(String word:banned){
            set.add(word);
        }
        String[] words = paragraph.replaceAll("[^a-zA-Z0-9\\s]", " ").trim().split("\\s+");
        for(String word:words){
            word=word.toLowerCase();
            if(!set.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        int freq=0;
        String fre="";
        for(String key:map.keySet()){
            if(freq<map.get(key)){
                freq=map.get(key);
                fre=key;
            }
        }
    return fre;
    }
}