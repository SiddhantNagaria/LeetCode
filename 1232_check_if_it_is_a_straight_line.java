class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        var slope = coordinates[1][0] == coordinates[0][0]
                ? Double.MAX_VALUE
                : (double) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        var c = coordinates[0][1] - slope * coordinates[0][0];

        for (var i = 2; i < coordinates.length; i++)
            if (slope == Double.MAX_VALUE
                    ? coordinates[i][0] != coordinates[0][0]
                    : coordinates[i][1] - slope * coordinates[i][0] != c)
                return false;

        return true;
    }
}