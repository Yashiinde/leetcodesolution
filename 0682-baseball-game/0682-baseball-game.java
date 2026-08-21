class Solution {
    public int calPoints(String[] operations) {
        int x=0;
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int num = st.peek();
                st.push(num*2);
            }else if(s.equals("+")){
                int num1=st.pop();
                int num2=st.peek();
                st.push(num1);
                st.push(num1+num2);
            }else{
                int number=Integer.parseInt(s);
                st.push(number);
            }
        }
        while(!st.isEmpty()){
            x+=st.pop();
        }
        return x;
    }
}