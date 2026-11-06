class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt=0;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]+diff)&&hs.contains(nums[i]-diff)) cnt++;
        }
        return cnt;
    }
}