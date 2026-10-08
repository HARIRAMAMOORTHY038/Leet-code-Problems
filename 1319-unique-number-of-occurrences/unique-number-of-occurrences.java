class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map <Integer,Integer> hm=new HashMap<>();
        Map <Integer,Integer> hm2=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int x:hm.values())
        {
            l.add(x);
        }
        for(int i=0;i<l.size();i++)
        {
            hm2.put(l.get(i),hm2.getOrDefault(l.get(i),0)+1);
        }
        boolean ans=true;
        for(int x:hm2.values())
        {
            if(x>1)
            {
                ans=false;
                break;
            }
        }
        return ans;
    }
}