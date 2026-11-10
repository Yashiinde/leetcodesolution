class Solution {
    public int getsq(int n){
        int sq=0;
        while(n>0){
            int digit=n%10;
            sq+=digit*digit;
            n/=10;
        }
        return sq;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int num=n;
        set.add(num);
        while(num>1){
            num=getsq(num);
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }
}