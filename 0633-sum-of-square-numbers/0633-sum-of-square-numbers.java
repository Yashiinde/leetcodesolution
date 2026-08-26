class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long num=left*left+right*right;
            if(num==c){
                return true;
            }else if(num<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}