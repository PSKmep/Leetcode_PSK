class Solution {
    /**
     * Reverses the digits of a signed 32-bit integer.
     *
     * @param x The input integer within the range [-2^31, 2^31 - 1].
     * @return The reversed integer, or 0 if the reversal causes the value 
     *         to go outside the signed 32-bit integer range.
     */
    public int reverse(int x) {
        int reversedNum = 0;
        while (x != 0) {
            // Extract the last digit of x
            int digit = x % 10;
            
            // Check for potential overflow before updating reversedNum
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            // Append the digit to the reversed number
            reversedNum = reversedNum * 10 + digit;
            
            // Remove the last digit from x
            x /= 10;
        }
        return reversedNum;
    }
}

