package AlgoAgain.DAY4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 33, 4, 11, 4, 66};
//        int[] arr = {2, 4, 11, 33, 4, 66};

        for (int i = 1; i < arr.length; i++) {
            //    33
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
//                j = j - 1;
                j--;
            }

            arr[j + 1] = key;

        }
        System.out.println(Arrays.toString(arr));
    }
}
