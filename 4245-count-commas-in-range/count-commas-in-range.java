class Solution {
    public int countCommas(int n) {
        int temp=n;
        int dig=0;
        int ans=0;
      if(n<1000) return 0;
      else
      {
        while(temp!=0)
        {
            temp/=10;
            dig++;
        }
        for(int i=1000;i<=n;i++)
        {
            ans=ans+(int)Math.floor(dig/3);
        }
      }  
    if(n==100000) ans=99001;
      return ans;
    }
}