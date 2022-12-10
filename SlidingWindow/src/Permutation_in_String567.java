import java.util.Arrays;

public class Permutation_in_String567 {
    public boolean checkInclusion(String s1, String s2) {
//超时！！！需要更改
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) return false;

        int[] arr1 = new int[26];
        for (int i = 0; i < len1; i++) {
            arr1[s1.charAt(i) - 'a']++;

        }
        int left = 0;
        int right = len1 - 1;
        while (right != len2) {
            int[] arr2 = new int[26];
            for (int j = left; j <= right; j++) {

                arr2[s2.charAt(j) - 'a']++;
            }
            if (Arrays.equals(arr1, arr2)) return true;


        }
        return false;
    }
}

