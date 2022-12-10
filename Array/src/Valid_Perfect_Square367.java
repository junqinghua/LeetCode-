public class Valid_Perfect_Square367 {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long res = (long) mid * mid;
            if (res < num) {
                left = mid + 1;
            } else if (res > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
