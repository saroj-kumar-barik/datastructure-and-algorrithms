package DataStructuresAndAlgorithms.DAY5;

import java.util.Arrays;

public class BubbleSortOnStrings {
    public static void main(String[] args) {
        // applying optimised bubble sort on string array
        String[] arr = {"man", "woman", "trans", "male", "female"};
        boolean flag;

        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    String temp;
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
