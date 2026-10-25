class Solution {
    public int romanToInt(String s) {
        int i=0;
        int num=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='I'){
                if(i+1<s.length() && s.charAt(i+1)=='V'){
                    num+=4;
                    i++;
                }else if(i+1<s.length() && s.charAt(i+1)=='X'){
                    num+=9;
                    i++;
                }else{
                    num+=1;
                }
            }else if(ch=='V'){
                num+=5;
            }else if(ch=='X'){
                if(i+1<s.length() && s.charAt(i+1)=='L'){
                    num+=40;
                    i++;
                }else if(i+1<s.length() && s.charAt(i+1)=='C'){
                    num+=90; 
                    i++;
                 }else{
                    num+=10;
                 }
            }else if(ch=='L'){
                num+=50;
            }else if(ch=='C'){
                if(i+1<s.length() && s.charAt(i+1)=='D'){
                    num+=400;
                    i++;
                }else if(i+1<s.length() && s.charAt(i+1)=='M'){
                    num+=900;
                    i++;
                }else{
                num+=100;
                }
            }else if(ch=='D'){
                num+=500;
            }else if(ch=='M'){
                num+=1000;
            }
            i++;
        }
        return num;
    }
}