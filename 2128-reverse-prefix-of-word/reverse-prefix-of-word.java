class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch) 
            {
                ind=i;
                break;
            }
            
        }
        if(ind==-1) return word;
        String tem=word.substring(0,ind+1);
        String temp=word.substring(ind+1,word.length());
        StringBuffer sb=new StringBuffer(tem);
         StringBuffer sh=new StringBuffer(temp);
        StringBuffer rev=sb.reverse();
        StringBuffer ans=rev.append(sh);
        String fin=ans.toString();
        return fin;

    }
}