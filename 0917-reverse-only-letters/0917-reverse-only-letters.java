class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder str=new StringBuilder("");
        StringBuilder str1=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                str.append(s.charAt(i));
        }
            
        }
        int i=0;
        int j=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
               str1.append(str.charAt(j));
               j++;   
        }else{
                str1.append(s.charAt(i));
            }
            i++;
        }
        return str1.toString();
    }
}