package DataStructuresAndAlgorithms.DAY9;

import java.util.Arrays;

public class StringSortingUsingInsertionSort {
    public static void main(String[] args) {
        String[] str = {"mama", "bablu", "saroj", "prajna", "ahmed"};
        for (int i = 1; i < str.length; i++) {
            String key = str[i];
            int j = i - 1;
            while (j >= 0 && str[j].compareTo(key) > 0) {
                str[j + 1] = str[j];
                j = j - 1;
            }
            str[j + 1] = key;
        }
        System.out.println(Arrays.toString(str));
    }
}
