public class test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 2};
        System.out.println(validMountainArray(arr));

    }

    public static boolean validMountainArray(int[] arr) {
        int num1 = 0;
        int num2 = 0;
        if (arr.length < 3) {
            return false;
        }



        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            } else if (arr[i] < arr[i - 1]) {
                num1 = i-1;
                break;
            }

        }
        for (int j = arr.length - 2; j >= 0; j--) {
            if (arr[j] == arr[j + 1]) {
                return false;
            } else if (arr[j] < arr[j + 1]) {
                num2 = j-1;
                break;
            }
        }

        if (num1 == num2) {
            return true;
        }

        return false;
    }
}

