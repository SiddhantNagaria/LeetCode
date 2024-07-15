class Solution {
    int min = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[n][n];
        for (int[] flight : flights) {
            dp[flight[0]][flight[1]] = flight[2];
        }
        dfs(dp, src, dst, k, 0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    void dfs(int[][] dp, int src, int dst, int k, int price) {
        if (src == dst) {
            min = Math.min(min, price);
            return;
        }
        if (k < 0 || price >= min) {
            return;
        }
        for (int i = 0; i < dp.length; i++) {
            if (dp[src][i] != 0 && price + dp[src][i] < min) {
                dfs(dp, i, dst, k - 1, price + dp[src][i]);
            }
        }
    }
}