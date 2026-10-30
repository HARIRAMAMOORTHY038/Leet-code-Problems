class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int [] ans=new int [n*2];
        List<Integer> ans=new ArrayList<>();
        int [] st=new int [n];
        int [] end=new int [n];
        for(int i=0;i<n;i++)
        {
            st[i]=nums[i];
        }
        for(int i=n;i<n*2;i++)
        {
            end[i%n]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ans.add(st[i]);
            ans.add(end[i]);
        }
       int [] fin=ans.stream().mapToInt(Integer::intValue).toArray();
     
        return fin;
       
    }
}