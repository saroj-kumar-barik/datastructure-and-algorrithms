package DataStructuresAndAlgorithms.DAY6;

import java.util.Arrays;
import java.util.Random;

public class OptimisedBubbleSort {
    public static void main(String[] args) {
//        int[] arr = {22, 11, 45, 67, 1, 0, -1};

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            int j = r.nextInt(100);
            arr[i] = j;
        }
        // by adding a flag or we can say condition, then, if the numbers are already sorted then the 1st loop will run
        // once then the 2nd for loop
        // will run n times (i.e for best case) . so the time complexity will be O(n) rather than the previous one
        // which is O(n*n)
        System.out.println(Arrays.toString(arr));
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
