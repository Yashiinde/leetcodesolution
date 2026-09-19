class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros=0;
        for(int num:arr){
            if(num==0){
                zeros++;
            }
        }
        int i=arr.length-1;
        int j=arr.length-1+zeros;
        while(i!=j){
            if(j<arr.length){
                arr[j]=arr[i];
            }
            j--;
            if(arr[i]==0){
               if(j<arr.length){
                arr[j]=0;
            } 
            j--;
            }
            i--;
        }
    }
}