class Solution {
    public boolean isPerfectSquare(int num) {
        int max=num/2;
        if(num==1){
            return true;
        }
        int i=1;
        while(i<=max){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}