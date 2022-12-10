import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings205 {
    public boolean isIsomorphic(String s, String t) {
        //看到映射应该立刻想起来map
        Map<Character, Character> mp1 = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            if (!mp1.containsKey(s.charAt(i))) {
                mp1.put(s.charAt(i), t.charAt(j));
            }
            if (!mp2.containsKey(t.charAt(j))) {
                mp2.put(t.charAt(j), s.charAt(i));
            }
            if (mp1.get(s.charAt(i)) != t.charAt(j) || mp2.get(t.charAt(j)) != s.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}
