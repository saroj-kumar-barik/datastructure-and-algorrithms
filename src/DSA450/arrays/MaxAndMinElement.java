package DSA450.arrays;

import java.util.Arrays;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] arr = {3,43,1,56,0};
        int max = 0;
        int min = 0;
        int left = 0, right = arr.length-1;
        for (int i= 1;i < arr.length-1;i++){
            if (arr[left] > arr[right])
            {
                min = arr[right];
                left++;
                right--;
            }else{
                max = arr[right];
                left++;
                right--;
            }
        }
        System.out.println("min value : "+min);
        System.out.println("max value : "+max);
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
