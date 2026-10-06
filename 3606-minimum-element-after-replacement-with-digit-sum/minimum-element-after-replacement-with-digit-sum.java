class Solution {
    public int minElement(int[] nums) {
        Set<Integer> hm=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            while(nums[i]!=0)
            {
                 sum+=nums[i]%10;
                 nums[i]/=10;
            }
            hm.add(sum);
            

        }
        List <Integer> al= new ArrayList<>();
        for(int x:hm)
        {
            al.add(x);
        }
        Collections.sort(al);
        int ans=al.get(0);
        return ans;
    }
}