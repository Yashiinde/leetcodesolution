class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        if(s.length()<=1){
            return s.length();
        }
        int max=1;
        for(int i=0;i<s.length();i++){ 
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                set=new HashSet<>(); 
                break;
            }
                set.add(s.charAt(j));
                max=Math.max(set.size(),max);
            } 
        }
        return max;
    }
}