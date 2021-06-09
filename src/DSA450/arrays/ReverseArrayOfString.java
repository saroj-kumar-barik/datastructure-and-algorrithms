package DSA450.arrays;

import java.util.Arrays;

public class ReverseArrayOfString {

    /*public static void main(String[] args) {
        String[] arr = {"bablu","saroj","sunil","john"};
        String[] arr1 = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0;i--){
            arr1[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }*/

    public static void main(String[] args) {
        String[] arr = {"bablu", "saroj", "sunil", "john", "doe"};
        int len = (arr.length - 1) / 2;
        int i = 0, j = arr.length - 1;
        while (len != 0) {
            swap(arr, i, j);
            i++;
            j--;
            len--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
