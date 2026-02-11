class Solution
{
    public int dominantIndices(int[] nums) 
    {  
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            boolean a=isdom(nums,i);
            if(a==true)
            {
                max=max+1;
            }
            
        }
        return max;
    }
    public boolean isdom(int[] nums, int i)
    {
        boolean a=false;
        int sum=0;
        for(int k=i+1;k<nums.length;k++)
        {
            sum= sum+nums[k];
        }
        int avg=sum/(nums.length-1-i);
        if(nums[i]>avg)
        {
            a=true;
        }
        else{a=false;}
        return a;
    }
}
