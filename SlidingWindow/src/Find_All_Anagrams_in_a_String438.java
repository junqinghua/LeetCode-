public class Find_All_Anagrams_in_a_String438 {

//滑动窗口经典思路模版
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        int left=0;
        int right =0;
        int count=0;


        for(char c: p.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
            char r =s.charAt(right);
            right++;
            if(need.containsKey(r)){
                window.put(r,window.getOrDefault(r,0)+1);

                if(window.get(r).equals(need.get(r))){
                    count++;
                }
            }

            while(count==need.size()){
                //这里进行操作
                if(right-left==p.length()){
                    res.add(left);
                }
                char l = s.charAt(left);
                left++;
                if(need.containsKey(l)){
                    if(window.get(l).equals(need.get(l))){

                        count--;
                    }
                    window.put(l,window.getOrDefault(l,0)-1);

                }
            }


        }

        return res;
    }
}




}
