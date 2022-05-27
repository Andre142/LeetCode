class Solution {
    public int lengthOfLongestSubstring(String s) {
       int a=0;
       int[] c=new int[256];
        for (int i=0,j=0;i<s.length();i++)
        {
            j=Math.max(j,c[s.charAt(i)]);
            c[s.charAt(i)]=i+1;
            a=Math.max(a,i-j+1);
        }
        return a;
    }
}
