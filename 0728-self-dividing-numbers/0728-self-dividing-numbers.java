class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i%10==0){
                continue;
            }
            int n=i;
            boolean divides=true;
            while(n>0){
                int reminder=n%10;
                if(reminder==0){
                  divides=false;
                    break;  
                }
                if(i%reminder!=0){
                    divides=false;
                    break;
                }
                n/=10;
            }
            if(divides){
                list.add(i);
            }
        }
        return list;
    }
}