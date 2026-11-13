class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[26];
        int i=0;
        for(char ch:text.toCharArray()){
            if(ch=='b'){
                arr[ch-'a']++;
            }else if(ch=='a'){
                arr[ch-'a']++;

            }else if(ch=='l'){
                arr[ch-'a']++;
            }else if(ch=='o'){
                arr[ch-'a']++;
            }else if(ch=='n'){
                arr[ch-'a']++;
            }
            if(arr['b'-'a']>0 && arr['a'-'a']>0 && arr['l'-'a']>1 && arr['o'-'a']>1 && arr['n'-'a']>0 ){
                arr['b'-'a']--;
                arr['a'-'a']--;
                arr['l'-'a']-=2;
                arr['o'-'a']-=2;
                arr['n'-'a']--;
                i++;
            }
        }
        
        // while(true){
        //     if(arr['b'-'a']>0 && arr['a'-'a']>0 && arr['l'-'a']>1 && arr['o'-'a']>1 && arr['n'-'a']>0 ){
        //         arr['b'-'a']--;
        //         arr['a'-'a']--;
        //         arr['l'-'a']-=2;
        //         arr['o'-'a']-=2;
        //         arr['n'-'a']--;
        //         i++;
        //     }else{
        //         break;
        //     }

        // }
        return i;
    }
}