class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        for(int i=0;i<nums1.length;i++){
             if(!set2.contains(nums1[i])){
                list1.add(nums1[i]);
                set2.add(nums1[i]);
            }
        }
        list.add(list1);
        list1 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
             if(!set1.contains(nums2[i])){
                list1.add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
         list.add(list1);
        return list;
    }
}