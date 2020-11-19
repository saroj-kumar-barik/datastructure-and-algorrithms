package DataStructuresAndAlgorithms.DAY4;

import java.util.Arrays;

public class StringSortingUsingSelectionSort {

    public static void main(String[] args) {
        int j;

        String[] arr = {"mama", "bablu", "pragyna", "saroj","bibhu","miki","summu"};

        System.out.println("Array before sorting");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String minValue = arr[i];
            int minIndex = i;
            for (j = minIndex + 1; j < arr.length; j++) {
                if (arr[j].compareTo(minValue) < 0) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            String temp;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.println("array after sorting..");
        System.out.println(Arrays.toString(arr));

    }
}
