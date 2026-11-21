class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> es:hm.entrySet())
        {
            if((es.getKey().equals(es.getValue()))&&es.getKey()>max) max=es.getKey();
        }
        return max;
    }
}