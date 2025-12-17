class Solution {
    public boolean isPalindrome(int x) 
    {
        int org=x;
        int d=0;
        int r=0;
        if(x<0)
        {
            return false;
        }
        if(x>0)
        {
            while(x!=0)
            {
                d=x%10;
                r=r*10+d;
                x=x/10;

            }
            if(r==org)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
    
}
