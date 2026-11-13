class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int arr[]=new int[26];
      for(char ch:allowed.toCharArray()){
        arr[ch-'a']++;
      } 
      int count=0;
      for(String word:words){
        int i=0;
        boolean exist=true;
        while(i<word.length()){
            char ch=word.charAt(i);
            if(arr[ch-'a']<1){
                exist=false;
                break;
            }
            i++;
        }
        if(exist){
            count++;
        }
      } 
      return count;
    }
}