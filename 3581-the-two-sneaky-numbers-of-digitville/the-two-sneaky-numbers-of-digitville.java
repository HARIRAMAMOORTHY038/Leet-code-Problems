class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==2)
            {
                arr[j]=entry.getKey();
                j++;
            }
        }
        return arr;
    }
}