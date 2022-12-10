import java.util.*;

public class test5 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 4, -5, 11, -3, 4, -1, 5, 0, 11, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> ls = new LinkedList<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer val : map.values()) {
            if (set.contains(val)) {
                return false;
            } else {
                set.add(val);
            }
        }
        return true;
    }
}





