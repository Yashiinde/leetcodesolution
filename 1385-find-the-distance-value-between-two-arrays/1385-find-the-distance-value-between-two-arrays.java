class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int count=0;
       for(int num:arr1){
        count++;
        for(int num1:arr2){
            if(Math.abs(num-num1)<=d){
                count--;
                break;
            }
        }
       } 
       return count;
    }
}