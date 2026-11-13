class Solution {
    public boolean validDigit(int n, int x) {
        boolean pre=false;
        int temp=n;
        int dig=0;
        while(temp!=0)
        {
            int ld=temp%10;
            if(ld==x) pre=true;
            temp/=10;
            dig++;
        }
        boolean flag=true;
        int fd=(int)(n/Math.pow(10,dig-1));
        if(fd==x)flag=false;
        return(pre&&flag);
    }
}