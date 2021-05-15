package AlgoAgain.DAY3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {65, 31,22,33, 55};

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 22 < 65
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // The swap done outside of the 2nd for loop becz we need to
            // traverse all the elements from
            int temp;
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
