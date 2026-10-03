class Solution {
    public int compress(char[] chars) {
        int idx=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            String x = String.valueOf(count);
            chars[idx++]=ch;
            
            if(count>1){
               for(int j=0;j<x.length();j++){
                chars[idx++]=x.charAt(j);
                
               }
            }
            
        }
        return idx;
    }
}