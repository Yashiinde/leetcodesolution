class Solution {
    public boolean checkString(String s) {
        boolean Axist= true;
        for(char ch:s.toCharArray()){
            if(ch=='a' &&  !Axist){
                return false;
            }
            if(ch=='b'){
                Axist=false;
            }
        }
        return true;
    }
}