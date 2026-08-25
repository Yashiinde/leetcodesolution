class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<asteroids.length;i++){
        int num=asteroids[i];
        boolean destroy=false;
        if(st.isEmpty()){
            st.push(num);
        }else if(num<0){
            while(!st.isEmpty() && st.peek()>0 && st.peek()<-num){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()== -num){
                st.pop();
                destroy=true;
            }else if(!st.isEmpty() && st.peek()>-num){
                destroy=true;
                }
                if(!destroy){
                    st.push(num);
                }
            
           
        }
        else{
            st.push(num);
        }
        
      }  
      int size=st.size();
        int arr[]=new int[size];
        int i=size-1;
        while(!st.isEmpty()){
            arr[i]=st.pop();
            i--;
        }
        return arr;
    }
}