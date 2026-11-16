class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int num1=arr[s.charAt(0)-'a'];
        for(int num:arr){
            if(num!=0 && num!=num1){
                return false;
            }
        }
        return true;
    }
}