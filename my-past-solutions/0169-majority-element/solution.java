import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) 
    { 
        int n = nums.length;
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        for(int i : nums)
        {
            int k = arr.getOrDefault(i, 0) + 1;
            arr.put(i, k);
        }
        int max = 0;
        int res = 0;
        for(int i : arr.keySet())
        {
            if(arr.get(i) > max)
            {
                max = arr.get(i);
                res = i;
            }
        }
        return res;
    }
}

