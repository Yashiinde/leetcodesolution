class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        boolean space=true;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && space){
                space = false;
                count++;
            }
            else if(s.charAt(i)==' '){
                space=true;
            }
        }
        return count;
    }
}