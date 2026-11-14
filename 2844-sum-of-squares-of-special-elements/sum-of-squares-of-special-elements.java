class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            if(n%(i+1)==0)
            {
                sum+=Math.pow(nums[i],2);
            }
        }
        int temp=(int)Math.pow(nums[n-1],2);
        sum=sum+temp;
        return sum;
    }
}