public class Minimum_Window_Substring76 {

    public String minWindow(String s, String t) {
        //need用来记录t里的字符和出现的次数
        Map<Character,Integer> need = new HashMap<>();
        //窗口用来记录遍历的字符和出现的次数
        Map<Character,Integer> window = new HashMap<>();
        int left=0;
        int right =0;
        int count =0;
        int start=0;
        int min = Integer.MAX_VALUE;

        for(char c: t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        while(right<s.length()){
            char r =s.charAt(right);
            right++;
            //先移动右指针，如果当前字符在need中有则添加至window等待使用
            if(need.containsKey(r)){
                window.put(r,window.getOrDefault(r,0)+1);
                //注意这里的嵌套关系
                if(window.get(r).equals(need.get(r))){
                    count++;
                }
            }
            //都在一个while大循环里
            while(count == need.size()){
                char l = s.charAt(left);
                //右边找到完毕之后开始移动左指针，缩小窗口，更新最小长度
                if(right-left<min){
                    start = left;
                    min = right -left;
                }
                left++;
                if(need.containsKey(l)){
                    if(window.get(l).equals(need.get(l))){
                        count--;
                    }
                    window.put(l,window.getOrDefault(l,0)-1);
                }
            }
        }
        return min ==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}
}
