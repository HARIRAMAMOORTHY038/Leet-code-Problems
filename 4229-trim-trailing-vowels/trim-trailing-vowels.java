class Solution {
    public String trimTrailingVowels(String s) {
        while(s.length()>0&&(s.endsWith("a")||s.endsWith("e")||s.endsWith("i")||s.endsWith("o")||s.endsWith("u")))
        {
            s=s.substring(0,s.length()-1);
        }
        return s;
    }
}