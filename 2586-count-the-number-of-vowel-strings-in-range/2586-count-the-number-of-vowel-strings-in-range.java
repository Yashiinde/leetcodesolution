class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String word=words[i];
            char ch1=word.charAt(0);
            char ch2=word.charAt(word.length()-1);
            if("aeiou".indexOf(ch1)!=-1 && "aeiou".indexOf(ch2)!=-1){
                count++;
            }
        }
        return count;
    }
}