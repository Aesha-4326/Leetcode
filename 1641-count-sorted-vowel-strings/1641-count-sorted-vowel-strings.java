class Solution {
    public int countVowelStrings(int n) {
        
        int[] dp = {1, 1, 1, 1, 1};

        for (int len = 2; len <= n; len++) {

            for (int i = 3; i >= 0; i--) {
                dp[i] += dp[i + 1];
            }
        }

        int ans = 0;

        for (int x : dp)
            ans += x;

        return ans;
    }
}