class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> hm=new HashMap<>();
        int [] arr=Integer.toString(n).chars().map(c -> c -'0').toArray();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int min=-1;
        int val=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>es:hm.entrySet())
        {
             if(es.getValue()<val)
             {
                min=es.getKey();
                val=es.getValue();
             }
        }
        return min;
    }
}