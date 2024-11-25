package ca.jane._00_dp.dual_sequence;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] count = new int[m+1][n+1];
        count[0][0] = 1;
        for (int i = 1; i < m + 1; ++i) count[i][0] = 1;
        for (int i = 1; i < m + 1; ++i) {
            for (int j = 1; j < n + 1; ++j) {
                count[i][j] = count[i - 1][j];
                if (s.charAt(i-1) == t.charAt(j - 1)) count[i][j] += count[i-1][j-1];
            }
        }
        return count[m][n];
    }
}
