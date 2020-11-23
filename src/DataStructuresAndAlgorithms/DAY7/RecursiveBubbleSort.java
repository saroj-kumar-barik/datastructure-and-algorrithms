package DataStructuresAndAlgorithms.DAY7;

import java.util.Arrays;

public class RecursiveBubbleSort {
    void recursiveBubbleSort(int[] arr,int len) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (len == 1)
                return;

            if (arr[i + 1] < arr[i]) {
                int temp;
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        recursiveBubbleSort(arr,len-1);
    }

    public static void main(String[] args) {
        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        int[] arr = {11, 77, 55, 22, 33, 55};
        int len = arr.length;
        obj.recursiveBubbleSort(arr,len);
        System.out.println("Sorted array : "+ Arrays.toString(arr) );
    }
}
