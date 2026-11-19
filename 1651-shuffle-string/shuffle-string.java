class Solution {
    public String restoreString(String s, int[] indices) {
       char [] ans=new char[s.length()];
       for(int i=0;i<indices.length;i++)
       {
            int val=indices[i];
            ans[val]=s.charAt(i);
       } 
       String res=new String(ans);
       return res;
    }
}