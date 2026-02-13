class Solution {
public:
    int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int twoBack = 1; // Represents ways to reach step n-2
        int oneBack = 2; // Represents ways to reach step n-1
        int current = 0;

        for (int i = 3; i <= n; ++i) {
            current = oneBack + twoBack;
            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }
};

