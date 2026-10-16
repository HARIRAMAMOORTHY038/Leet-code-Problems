class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(int i=0;i<patterns.length;i++)
        {
            String w=patterns[i];
            if(word.contains(w))
            {
                cnt++;
            }
        }
        return cnt;
    }
}