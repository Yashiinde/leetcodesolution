class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                n--;
            }
        }
       else{
         if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        for(int i=1;i<flowerbed.length;i++){
            if(flowerbed.length>i+1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
            }else{
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                 n--;
               }
            }
            
        }
       }
        if(n<=0){
            return true;
        }
        return false;
    }
}