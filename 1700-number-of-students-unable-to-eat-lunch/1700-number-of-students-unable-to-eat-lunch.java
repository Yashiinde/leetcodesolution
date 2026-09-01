class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
                q.add(students[i]);
        }
        int i=0;
        int j=0;
        while(!q.isEmpty()){
            if(q.size()<=i){
                break;
            }
            if(sandwiches[j]==q.peek()){
                q.poll();
                i=0;
                j++;
            }else{
                q.add(q.poll());
                i++;
            }

        }
        return q.size();
    }
}