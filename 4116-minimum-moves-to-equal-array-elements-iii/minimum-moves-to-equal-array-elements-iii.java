class Solution {
    public int minMoves(int[] nums) {
        int cnt=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            cnt+=max-nums[i];
        }
        return cnt;
    }
}