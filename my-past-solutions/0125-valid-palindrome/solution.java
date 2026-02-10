class Solution {
    public boolean isPalindrome(String s) {
        // Change: Use [^a-zA-Z0-9] to remove spaces AND punctuation
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s= s.toLowerCase();
        
        int n = s.length();
        int i = 0;
        int j = n - 1;

        if (s.isEmpty()) {
            return true;
        }

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

