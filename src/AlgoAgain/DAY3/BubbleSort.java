package AlgoAgain.DAY3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {65, 22, 31, 6, 71};
//        int[] arr = {22, 65, 31, 6, 71};
//        int[] arr = {22, 31, 65, 6, 71};
//        int[] arr = {22, 31, 6, 65, 71};
//        int[] arr = {27,23,29,31,22,24,16,5,28,11,20,34,25,1,19,8,10};

        for (int i = 0; i < arr.length; i++) { // 5 * 4 = 20 (5 * 4 / 2 = 10) (n*(n-1))/2
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // c = a
                    // a = b
                    // b = c
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
