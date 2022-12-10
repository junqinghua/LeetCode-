import java.util.Arrays;

public class Assign_Cookies455 {
    public int findContentChildren(int[] g, int[] s) {
        //从最小的一块一块满足
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int start=0;
        for(int i =0;i<s.length && start<g.length;i++){
            if(s[i]>=g[start]){
                count++;
                start++;
            }
        }

        return count;
    }
}