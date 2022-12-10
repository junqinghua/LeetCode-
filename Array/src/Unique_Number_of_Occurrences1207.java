import java.util.*;

public class Unique_Number_of_Occurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
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

