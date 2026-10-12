class Solution {
    public void reverseString(char[] s) {
       int lf=0;
       int rgt=s.length-1;
       while(lf<rgt)
       {
        char tem=s[lf];
        s[lf]=s[rgt];
        s[rgt]=tem;
        lf++;
        rgt--;
       }
    }
}