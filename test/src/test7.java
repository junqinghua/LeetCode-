public class test7 {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder ssb = new StringBuilder(); // 模拟栈
        StringBuilder tsb = new StringBuilder(); // 模拟栈
        // 分别处理两个 String
        for (char c : s.toCharArray()) {
            if (c != '#') {
                ssb.append(c); // 模拟入栈
            } else if (ssb.length() > 0) { // 栈非空才能弹栈
                ssb.deleteCharAt(ssb.length() - 1); // 模拟弹栈
            }
        }
        for (char c : t.toCharArray()) {
            if (c != '#') {
                tsb.append(c); // 模拟入栈
            } else if (tsb.length() > 0) { // 栈非空才能弹栈
                tsb.deleteCharAt(tsb.length() - 1); // 模拟弹栈
            }
        }
        return ssb.toString().equals(tsb.toString());
    }
}


