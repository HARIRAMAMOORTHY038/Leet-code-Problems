class Solution {
    // static int sum(int d)
    // {
    //     int tot=0;
    //     tot+=d;
    //     return tot;
    // }
    public int findPermutationDifference(String s, String t) {
       Map<Character,Integer> hm=new HashMap<>();
       Map<Character,Integer> hm2=new HashMap<>();
       int ans=0;
       for(int i=0;i<s.length();i++)
       {
        hm.put(s.charAt(i),i);
       }
       for(int i=0;i<t.length();i++)
       {
        hm2.put(t.charAt(i),i);
       }
       for(int i=0;i<s.length();i++)
       {
          int a=hm.get(s.charAt(i));
          int b=hm2.get(s.charAt(i));
          int d=Math.abs(a-b);
          ans=ans+d;
       }
       return ans;
    }
}