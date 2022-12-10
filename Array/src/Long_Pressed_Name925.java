public class Long_Pressed_Name925 {
    public boolean isLongPressedName(String name, String typed) {
        //一开始还以为map就能做结果发现这里是要看顺序的。。。只能正常遍历并找边界值了
        //old school 方法
        int i = 0;
        int j = 0;
        int m = name.length();
        int n = typed.length();
        while (i < m || j < n) {
            if (i >= m || j >= n || name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            while (i < m && j < n && name.charAt(i) == typed.charAt(j)) {
                ++i;
                ++j;
            }
            while (j < n && typed.charAt(j) == name.charAt(i - 1)) {
                ++j;
            }

        }
        return true;
    }
}