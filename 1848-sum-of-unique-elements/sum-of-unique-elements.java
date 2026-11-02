class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>es:hm.entrySet())
        {
            if(es.getValue()==1) sum+=es.getKey();
        }
        return sum;
    }
}