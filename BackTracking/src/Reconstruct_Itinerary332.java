import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reconstruct_Itinerary332 {
    List<String> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    boolean[] used;

    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        path.add("JFK");
        used = new boolean[tickets.size()];
        backtracking(tickets);
        return res;
    }


    boolean backtracking(List<List<String>> tickets) {
        if (path.size() == tickets.size() + 1) {
            res = new LinkedList(path);
            return true;
        }
        for (int i = 0; i < tickets.size(); i++) {
            if (!used[i] && tickets.get(i).get(0).equals(path.getLast())) {
                path.add(tickets.get(i).get(1));
                used[i] = true;
                //不能理解
                if (backtracking(tickets)) {
                    return true;
                }

                used[i] = false;
                path.removeLast();
            }
        }
        return false;
    }

}
}
