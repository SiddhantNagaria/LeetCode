class Solution {
    public int uniquePathsWithObstacles(int[][] oG) {
        if (oG [0][0] == 1) return 0;
        oG[0][0] = 1;
        int m = oG.length;
        int n = oG[0].length;
        for (int i =1; i < m; i++){
            if (oG[i][0] == 1){
                oG[i][0] = 0;
            }else{
                oG[i][0] = oG[i - 1][0];
            }
        }
        for (int j = 1; j < n; j++){
            if (oG[0][j] == 1){
                oG[0][j] = 0;
            }else{
                oG[0][j] = oG[0][j - 1];
            }    
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j ++){
                if(oG [i][j] == 1){
                    oG[i][j] = 0;
                }else{
                    oG [i][j] = oG[i-1][j] + oG[i][j - 1];
                }
            }
        }
        return oG[m - 1][n - 1];
    }
}