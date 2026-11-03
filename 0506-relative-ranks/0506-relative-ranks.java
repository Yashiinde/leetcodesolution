class Solution {
    public String[] findRelativeRanks(int[] score) {
      String[] arr=new String[score.length];
      Integer[][] nums=new Integer[score.length][2];
      for(int i=0;i<score.length;i++){
         nums[i][0]=i;
         nums[i][1]=score[i];
      }
      Arrays.sort(nums, (a, b) -> Integer.compare(a[1], b[1]));
      int n=score.length-1;
      int i=n;
      while(i>=0){
        int ogidx=nums[i][0];
        if(i==n){
            arr[ogidx]="Gold Medal";
        }else if(i==n-1){
            arr[ogidx]="Silver Medal";
        }else if(i== n-2){
            arr[ogidx]="Bronze Medal";
        }else{
            arr[ogidx] = String.valueOf(n - i+1);
        }
        i--;
      }
      return arr;
    }
}