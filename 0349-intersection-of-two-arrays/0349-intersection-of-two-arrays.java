class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            int val=nums2[j];
            if(set.contains(val)){
                set2.add(val);          
                  }
        }
        int n=set2.size();
        int arr[]=new int[n];
        int i=0;
        Iterator it=set2.iterator();
        while(it.hasNext()){
            arr[i]=(int)it.next();
            i++;
        }
        return arr;
    }
}