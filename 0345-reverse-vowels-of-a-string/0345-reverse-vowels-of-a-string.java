class Solution {
    public boolean isVowel(char ch){
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }  
        return false;
    }
    public String reverseVowels(String s) {
       char[] chars = s.toCharArray(); 
       int i=0;
       int j=chars.length-1;    
       while(i<=j){
        char ch1=chars[i];
        char ch2=chars[j];
        if (!isVowel(ch1)){
            i++;
        }
        
        if (!isVowel(ch2)) {
            j--;
        }
        if(isVowel(ch1) && isVowel(ch2)){
            char temp=ch1;
            chars[i]=chars[j];
            chars[j]=ch1;
            i++;
            j--;
        }
       }
       StringBuilder str=new StringBuilder("");
       for(Character ch:chars){
        str.append(ch);
       }
       return str.toString();
    }
}