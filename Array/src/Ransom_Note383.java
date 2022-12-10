public class Ransom_Note383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rn = new int[26];
        for (char c : magazine.toCharArray()) {
            rn[c - 'a'] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            rn[c - 'a'] -= 1;
        }
        for (int i : rn) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}
