public class test10 {
    public static int edgeScore(int[] edges) {

        int n = edges.length;

        long[] s = new long[n];
        for (int x = 0; x < n; x++) {
            int y = edges[x];
            s[y] += x;
        }

        int res_x = 0;
        for (int x = 0; x < n; x++) {
            if (s[x] > s[res_x]) {
                res_x = x;
            }
        }

        return res_x;
    }


    public static void main(String[] args) {
        int[] edges = new int[]{1, 0, 0, 0, 0, 7, 7, 5};
        System.out.println(edgeScore(edges));

    }
}


