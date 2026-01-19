class Solution {
    public int numTilings(int n) {

        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] gap = new long[n + 1];
        if(n<2) return 1;

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        gap[0] = 0;
        gap[1] = 0;

        for (int i = 2; i <= n; i++) {
            gap[i] = (gap[i - 1] + dp[i - 2]) % MOD;
            dp[i] = (dp[i - 1] + dp[i - 2] + 2 * gap[i - 1]) % MOD;
        }

        return (int) dp[n];
    }
}
