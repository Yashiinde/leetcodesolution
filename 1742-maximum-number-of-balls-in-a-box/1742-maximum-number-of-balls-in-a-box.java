class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr=new int[46];
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int num=i;
            int rem=0;
            while(num>0){
                rem+=num%10;
                num/=10;
            }
            arr[rem]++;
            max=Math.max(arr[rem],max);
        }
        return max;
    }
}