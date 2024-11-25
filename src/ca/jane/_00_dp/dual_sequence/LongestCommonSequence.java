package ca.jane._00_dp.dual_sequence;

public class LongestCommonSequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; ++i) dp[i][0] = 0;
        for (int j = 0; j < n + 1; ++j) dp[0][j] = 0;
        for (int i = 1; i < m + 1; ++i) {
            for (int j = 1; j < n + 1; ++j) {
                int check = 0;
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                check = Math.max(dp[i][j-1], dp[i-1][j]);
                dp[i][j] = Math.max(dp[i][j], check);
            }
        }
        return dp[m][n];
    }
}
