class Solution {
    public String intToRoman(int num) {
        StringBuilder str=new StringBuilder("");
        int n=num;
        while(n>0){
            if(n>=1000){
                n-=1000;
                str.append('M');
            }else if(n>=900){
                n-=900;
                str.append("CM");
            }else if(n>=500){
                n-=500;
                str.append("D");
            }else if(n>=400){
                n-=400;
                str.append("CD");
            }else if(n>=100){
                n-=100;
                str.append("C");
            }else if(n>=90){
                n-=90;
                str.append("XC");
            }else if(n>=50){
                n-=50;
                str.append("L");
            }else if(n>=40){
                n-=40;
                str.append("XL");
            }else if(n>=10){
                n-=10;
                str.append("X");
            }else if(n==9){
                n-=9;
                str.append("IX");
            }else if(n>=5){
                n-=5;
                str.append("V");
            }else if(n==4){
                n-=4;
                str.append("IV");
            }else if(n>=1){
                n-=1;
                str.append("I");
            }
        }
        return str.toString();
    }
}