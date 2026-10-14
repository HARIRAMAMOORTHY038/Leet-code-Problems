class Solution {
    public String convertDateToBinary(String date) {
        String [] dt=date.split("-");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<dt.length;i++)
            {
                StringBuilder sb=new StringBuilder();
                int a=Integer.valueOf(dt[i]);
                while(a!=0)
                    {
                        sb.append(a%2);
                        a/=2;
                    }
                sb.reverse();
                if(i!=dt.length-1)
                {
                sb.append('-');
                }
               ans.append(sb);
            }
            String res=ans.toString();
            return res;
    }
}