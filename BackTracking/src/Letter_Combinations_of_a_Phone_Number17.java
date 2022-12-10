import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number17 {
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        String[] strNum = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(digits, strNum, 0);
        return res;
    }

    StringBuilder temp = new StringBuilder();

    void backtracking(String digits, String[] strNum, int index) {
        if (index == digits.length()) {
            res.add(temp.toString());
            return;
        }
        String str = strNum[digits.charAt(index)-'0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backtracking(digits, strNum, index + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
