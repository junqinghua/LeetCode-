import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class thy {
    public static List<Integer> gerneator(List<Integer> arr, int l, int r) {
        int diff = 0;
        List<Integer> brr = new ArrayList<>();
        brr.add(l);

        for (int i = 1; i < arr.size(); i++) {
            int brr_number = Math.max(arr.get(i) + diff + 1, brr.get(i - 1));
            diff = brr_number - arr.get(i);
            if (brr_number > r) {
                List<Integer> res2 = new ArrayList<>();
                res2.add(-1);
                return res2;
            }

            brr.add(brr_number);
        }

        System.out.println(brr);
        return brr;
    }

    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(1);
        ls.add(2);

        gerneator(ls, 1, 10);
    }

}
