class Solution {
    public int maxDifference(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int num1=0;
        int num2=Integer.MAX_VALUE;
        for(int num:arr){
           if (num == 0) continue;

            if( num%2==1){
                num1=Math.max(num,num1);
            }else{
                num2=Math.min(num,num2);
            }
        }
        return num1-num2;
    }
}