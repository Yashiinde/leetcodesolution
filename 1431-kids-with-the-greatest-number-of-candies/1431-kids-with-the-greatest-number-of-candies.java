class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> chekc = new ArrayList<>(candies.length);
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int j=0;j<candies.length;j++){
           chekc.add((candies[j]+extraCandies)>=max);        
        }
        return chekc;
    }
}