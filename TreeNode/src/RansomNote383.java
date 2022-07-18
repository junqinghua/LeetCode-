public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] count = new int [26];
        for(int i =0;i<magazine.length();i++){
            char c =magazine.charAt(i);
            count[c-'a']++;
        }
        for(int i =0;i<ransomNote.length();i++){
            char d =ransomNote.charAt(i);
            count[d-'a']--;
            if(count[d-'a']<0){
                return false;
            }
        }

        return true;
    }
}

