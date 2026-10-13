class Solution {
    public boolean isPalindrome(String s) {
        int lft=0;
        int rgt=s.length()-1;
        boolean pali=true;
        while(lft<rgt)
        {
            if(!Character.isLetterOrDigit(s.charAt(lft)))
            {
                lft++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(rgt)))
            {
                rgt--;
            }
            else 
            {
               char a=Character.toLowerCase(s.charAt(lft));
               char b=Character.toLowerCase(s.charAt(rgt));
               if(a!=b)
               {
                pali=false;
               }
                lft++;
            rgt--;
            }
           
        }
        return pali;
    }
}