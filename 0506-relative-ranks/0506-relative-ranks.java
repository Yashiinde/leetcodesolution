class Solution {
    public String[] findRelativeRanks(int[] score) {
      String[] arr=new String[score.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<score.length;i++){
        map.put(score[i],i);
      }
      Arrays.sort(score);
      int n=score.length-1;
      int i=n;
      while(i>=0 && i>n-3){
        int ogidx=map.get(score[i]);
        if(i==n){
            arr[ogidx]="Gold Medal";
        }else if(i==n-1){
            arr[ogidx]="Silver Medal";
        }else if(i== n-2){
            arr[ogidx]="Bronze Medal";
        }
        i--;
      }
        while(i>=0){
        int ogidx=map.get(score[i]);
           arr[ogidx] = String.valueOf(n - i+1);
            i--;

        }
      return arr;
    }
}