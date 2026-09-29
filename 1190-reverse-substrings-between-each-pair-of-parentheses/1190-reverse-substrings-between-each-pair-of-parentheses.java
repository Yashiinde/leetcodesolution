class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder("");
        for(char ch:s.toCharArray()){
            str=new StringBuilder("");
            if(ch==')'){
                while(st.peek()!='('){
                    str.append(st.pop());
                }
                st.pop();
                int i=0;
                while(i<str.length()){
                    st.push(str.charAt(i));
                    i++;
                }
            }else{
                st.push(ch);

            }
        }
        str=new StringBuilder("");
        for(Character ch:st){
            str.append(ch);
        }
        return str.toString();
    }
}