import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Open_the_Lock752 {
    //bfs也是一种回溯
    Queue<String> q = new LinkedList<>();
    Set<String> visited = new HashSet<>();
    Set<String> deads = new HashSet<>();
    int count = 0;

    public int openLock(String[] deadends, String target) {
        q.offer("0000");
        visited.add("0000");
        for (String str : deadends) {
            deads.add(str);
        }
        //经典模版
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                if (cur.equals(target)) {
                    return count;
                }
                if (deads.contains(cur)) {
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }

            }
            count++;
        }
        return -1;
    }

    String plusOne(String str, int j) {
        char[] ch = str.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    String minusOne(String str, int j) {
        char[] ch = str.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

}