class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuffer sb=new StringBuffer();
        StringBuffer check= new StringBuffer(s);
        for(int i=0;i<words.size();i++)
        {
            String temp=words.get(i);
            char a=temp.charAt(0);
            sb.append(a);
        }
        return (sb.toString().equals(check.toString()));
    }
}