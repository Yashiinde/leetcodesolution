import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int i=0;
      int j=0;
      int total=0;
      while(i<g.length && j<s.length)  {
        if(g[i]<=s[j]){
            total++;
            i++;
            j++;
        }else{
            j++;
        }
      }
      return total;
    }
}