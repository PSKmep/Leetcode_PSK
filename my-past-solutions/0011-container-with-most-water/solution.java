class Solution {
    public int maxArea(int[] height) 
    {
        int l=0;
        int a,w,h;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            a=Math.min(height[i],height[j]);
            w=j-i;
            h=a*w;
            if(h>l)
            {
                l=h;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
     return l;   
    }
}
