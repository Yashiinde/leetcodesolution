class Solution {
    public boolean halvesAreAlike(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(i<s.length()/2){
            if(ch=='a'){
                arr[ch-'a']++;
            }else if(ch=='e'){
                arr[ch-'e']++;
            }else if(ch=='i'){
                arr[ch-'i']++;
            }else if(ch=='o'){
                arr[ch-'o']++;
            }else if(ch=='u'){
                arr[ch-'u']++;
            }
            }else{
            if(ch=='a'){
                arr[ch-'a']--;
            }else if(ch=='e'){
                arr[ch-'e']--;
            }else if(ch=='i'){
                arr[ch-'i']--;
            }else if(ch=='o'){
                arr[ch-'o']--;
            }else if(ch=='u'){
                arr[ch-'u']--;
            }
            }
            
        }
        for(int num:arr){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}