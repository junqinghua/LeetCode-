import java.util.LinkedList;
import java.util.List;

public class Restore_IP_Addresses93 {
    public static void main(String[] args) {
      String s =  SrestoreIpAddresses("25525511135");

    }

    List<String> res = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return res;
        }
        backtracking(s, 0, 0);
        return res;
    }

    void backtracking(String s, int startIndex, int count) {
        if (count == 3) {
            if (isValid(s, startIndex, count)) {
                res.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i+1) + "." + s.substring(i + 1);
                count++;
                backtracking(s, i + 2, count);
                count--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }

    }
    boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + (s.charAt(start)-'0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
