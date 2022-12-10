import java.util.LinkedList;
import java.util.List;

public class Find_Common_Characters1002 {
    public List<String> commonChars(String[] words) {
        List<String> res = new LinkedList<>();
        int[] hash = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i) - 'a']++;
        }
        for (int j = 1; j < words.length; j++) {
            int[] hash2 = new int[26];
            for (int i = 0; i < words[j].length(); i++) {
                hash2[words[j].charAt(i) - 'a']++;

            }
            //关键是这一步，获取没每个数组中最小值
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], hash2[k]);
            }
        }//并将其转换为character
        for (int i = 0; i < 26; i++) {
            while (hash[i] != 0) {
                char c = (char) (i + 'a');
                res.add(String.valueOf(c));
                hash[i]--;

            }
        }
        return res;

    }
}