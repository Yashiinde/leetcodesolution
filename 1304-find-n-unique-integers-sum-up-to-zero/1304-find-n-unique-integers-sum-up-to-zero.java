class Solution {
    public int[] sumZero(int n) {
        int nums[]=new int[n];
        int i=0;
        int k=1;
        if(n%2==0){
            while(i<nums.length){
                nums[i]=k;
                nums[i+1]=0-k;
                i+=2;
                k++;
            }
        }else{
            nums[0]=0;
            i++;
            while(i<nums.length){
                nums[i]=k;
                nums[i+1]=0-k;
                i+=2;
                k++;
            }
        }
        return nums;
    }
}