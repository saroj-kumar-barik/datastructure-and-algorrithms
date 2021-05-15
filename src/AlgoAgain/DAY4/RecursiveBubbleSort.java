package AlgoAgain.DAY4;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void bubbleSort(int[] arr,int len){
        for (int i =0;i<arr.length-1;i++) {
            if (len == 1) {
                return;
            }

            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr,len-1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 33, 4, 55, 66};

        bubbleSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
