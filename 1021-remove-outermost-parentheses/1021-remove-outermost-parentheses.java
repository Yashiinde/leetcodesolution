class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder str1=new StringBuilder("");
       StringBuilder str2=new StringBuilder("");
       int count=0;
       for(char ch:s.toCharArray()){
        if(ch=='('){
        count++;
       }else if(ch==')'){
        count--;
       }
       str1.append(ch);
        if(count==0){
            str2.append(str1.substring(1,str1.length()-1));
            str1=new StringBuilder("");

        }
       }
       return str2.toString();
    }
}