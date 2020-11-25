package DataStructuresAndAlgorithms.DAY8;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {11, 32, 45, 5, -1, 34, 66};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array : " + Arrays.toString(arr));
    }
}
