class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int product=1;
        while(num>0){
            int rem=num%10;
            product*=rem;
            sum+=rem;
            num/=10;
        }
        int div=sum+product;
        if(n%div==0){
            return true;
        }
        return false;
    }
}