class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[nums.length];
        int i=1;
        int j=n;
        ans[0]=nums[0];
        for(int k=1;k<nums.length;k++)
        {
            if(k%2 !=0)
            {
                ans[k]=nums[j];
                j++;
            }
            
            else
            {
            ans[k]=nums[i];
            i++;
            }
        }
        return ans;
    }
}
