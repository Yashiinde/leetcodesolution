class Solution {
    public boolean canAliceWin(int n) {
       int num=10;
       int i=0;
       while(n>=num){
            n-=num;
            num--;
            i++;
       } 
       if(i%2==1){
        return true;
       }
       return false;
    }
}