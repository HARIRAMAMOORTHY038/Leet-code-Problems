class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Integer> hs=new HashSet<>();
        for(int x:hm.values())
        {
            hs.add(x);
        }
        if (hs.size()==1) return true;
        else return false;
    }
}