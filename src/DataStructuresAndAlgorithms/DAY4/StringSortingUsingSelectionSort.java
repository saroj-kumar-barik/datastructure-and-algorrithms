package DataStructuresAndAlgorithms.DAY4;

import java.util.Arrays;

public class StringSortingUsingSelectionSort {
    public static void main(String[] args) {
        String[] arr = {"mama", "bablu", "pragyna", "saroj"};

        System.out.println("Array before sorting");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String minValue = arr[i];
            int minIndex = i;
            for (int j = minIndex + 1; j < arr.length; j++) {
                if (arr[j].compareTo(minValue) < 0) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp;
                temp = minValue;
                minValue = arr[minIndex];
                arr[i] = temp;
            }

        }
        System.out.println("array after sorting..");
        System.out.println(Arrays.toString(arr));

    }
}
