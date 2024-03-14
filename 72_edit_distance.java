class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                }
            }
        }
        
        return dp[m][n];
    }
}
 
//OR 

class Solution {
    public int minDistance(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int temp[][] = new int[c1.length+1][c2.length+1];
        for(int i = 0; i < temp[0].length; i++){
            temp[0][i] = i;
        }
        for(int i = 0; i < temp.length; i++){
            temp[i][0] = i;
        }
        for(int i = 1; i <= c1.length; i++){
            for(int j = 1; j <= c2.length; j++){
                if(c1[i-1] == c2[j-1]){
                    temp[i][j] = temp[i-1][j-1];
                }else{
                    temp[i][j] = 1 + min(temp[i-1][j-1], temp[i-1][j], temp[i][j-1]);
                }
            }
        }
        return temp[c1.length][c2.length];
    }
    public int min(int a, int b, int c){
        int ans = Math.min(a,b);
        return Math.min(ans, c);
    }
}