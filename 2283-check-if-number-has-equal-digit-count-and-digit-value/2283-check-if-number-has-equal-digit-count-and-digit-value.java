class Solution {
    public boolean digitCount(String num) {
        int arr[]=new int[10];
        for(char ch:num.toCharArray()){
            arr[ch-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if((num.charAt(i)-'0')!=arr[i]){
                return false;
            }
        }
        return true;
    }
}