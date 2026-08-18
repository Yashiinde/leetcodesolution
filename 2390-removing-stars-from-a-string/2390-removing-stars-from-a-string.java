class Solution {
    public String removeStars(String s) {
       StringBuilder str= new StringBuilder("");
       int n=s.length()-1;
       for(int i=0;i<=n;i++){
        char ch=s.charAt(i);
        if(ch=='*'){
            str.deleteCharAt(str.length()-1);
        }else{
            str.append(ch);
        }

 }
    
    return str.toString();
}
 }