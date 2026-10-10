class Solution {
    public int mostWordsFound(String[] sentences) {
       int max=0;
       for(int i=0;i<sentences.length ;i++)
       {
            String[] w=sentences[i].split("\\s+");
            if(w.length>max) max=w.length;
       }
       return max;
    }
}