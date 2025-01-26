import java.util.*;

public class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];
        
        // Step 1: Calculate in-degrees for each node
        for (int f : favorite) {
            inDegree[f]++;
        }
        
        // Step 2: Use a queue to process nodes with zero in-degree (topological sort)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] longestPath = new int[n];
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int fav = favorite[node];
            longestPath[fav] = Math.max(longestPath[fav], longestPath[node] + 1);
            if (--inDegree[fav] == 0) {
                queue.offer(fav);
            }
        }

        // Step 3: Detect cycles and find max cycle length
        boolean[] visited = new boolean[n];
        int maxCycleSize = 0, sumChainPairs = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && inDegree[i] > 0) {
                int cycleSize = 0;
                int current = i;
                
                // Count cycle length
                while (!visited[current]) {
                    visited[current] = true;
                    cycleSize++;
                    current = favorite[current];
                }
                
                if (cycleSize == 2) {
                    // If it's a mutual pair, sum the two longest chains leading to them
                    sumChainPairs += (longestPath[i] + longestPath[favorite[i]] + 2);
                } else {
                    maxCycleSize = Math.max(maxCycleSize, cycleSize);
                }
            }
        }

        return Math.max(maxCycleSize, sumChainPairs);
    }
}
