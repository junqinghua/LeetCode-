import java.util.HashMap;
import java.util.Map;

public class Node_With_Highest_Edge_Score2374 {
    public int edgeScore(int[] edges) {
        Map<Integer, Long> mp = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if (!mp.containsKey(edges[i])) {
                mp.put(edges[i], (long) i);
            } else {
                mp.put(edges[i], mp.get(edges[i]) + i);
            }
        }

        long temp = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        for (int n : mp.keySet()) {
            long val = mp.get(n);
            if (val > temp) {
                res = n;
                temp = val;
            } else if (val == temp) {
                res = res < n ? res : n;
            }
        }
        return res;
    }
}
