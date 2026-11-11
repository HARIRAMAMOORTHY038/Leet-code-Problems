class Solution {
    public boolean checkGoodInteger(int n) {
        int temp=n;
        int dsum=0;
        int ssum=0;
        while(temp!=0)
        {
            dsum+=temp%10;
            temp/=10;
        }
        while(n!=0)
        {
            ssum+=Math.pow(n%10,2);
            n/=10;
        }
        return(ssum-dsum>=50);
    }
}