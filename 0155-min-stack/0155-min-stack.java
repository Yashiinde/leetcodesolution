class MinStack {
    
    public class node{
        int data;
        int min;
        node(int data,int min){
            this.data=data;
            this.min=min;
        }
    }
    private LinkedList<node> list;
    public MinStack() {
        this.list=new LinkedList<>();
    }
    public void push(int value) {
        if(list.isEmpty()){
            list.addFirst(new node(value,value));

        }else{
            int currmin=Math.min(value,list.getFirst().min);
            list.addFirst(new node(value,currmin));
        }
    }
    
    public void pop() {
        if(!list.isEmpty()){
        list.removeFirst();
        }
    }
    
    public int top() {
        if(!list.isEmpty()){
            return list.getFirst().data;
        }
        return -1;
    }
    
    public int getMin() {
        if(!list.isEmpty()){
            return list.getFirst().min;
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */