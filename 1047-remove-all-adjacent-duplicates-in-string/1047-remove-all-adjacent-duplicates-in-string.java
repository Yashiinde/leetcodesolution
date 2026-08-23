class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str=new StringBuilder("");
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(str.length()>0 && str.charAt(str.length()-1)==ch){
                str.deleteCharAt(str.length()-1);
                // if(str.length()!=0){
                //     str.deleteCharAt(str.length()-1);
                // } 
                // i++;
            }else{
                str.append(ch);
            }
            i++;
        }
        return str.toString();
    }
}