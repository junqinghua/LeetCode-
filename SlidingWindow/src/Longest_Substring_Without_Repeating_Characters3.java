import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters3 {
    class Solution {
        //只需要一个window，需要get到的是左窗口的更新，什么时候更新，如何更新（一定要取max最大值）
        public int lengthOfLongestSubstring(String s) {
            Map<Character,Integer> window = new HashMap<>();
            int left=0;
            int res =0;
            for( int right=0;right<s.length();right++){
                char c = s.charAt(right);
                 //if需要在最前面因为一开始就要先进判断不然会有bug
                if(window.containsKey(c)){
                    //注意这里的left指针不能往回 所以必须要用math.max
                    left=Math.max(left,window.get(c));
                }
                //最大长度
                res=Math.max(res,right-left+1);
                window.put(c,right+1);
+
            }


            return res;
        }
    }
}
