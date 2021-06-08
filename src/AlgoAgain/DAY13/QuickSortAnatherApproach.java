package AlgoAgain.DAY13;

import java.util.Arrays;

public class QuickSortAnatherApproach {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void qsort(int[] arr, int f, int l){
        // for recursion terminating condition
        if (f >= l) return;
        // temp variables
        int left = f;
        int right = l;


        // taking pivot
        int pivot = arr[(left+right)/2];
//        int pivot = arr[left];
//        int pivot = arr[right];


        // place the pivot element in the rightful(nearly right position)

        // procedure :
        // 1. 1st while loop runs - total length of array(left<=right)
        // 2, 2nd whiele loop(which is indside first loop) runs start element to pivot
        // 3. 3nd whiele loop(which is indside first loop) runs pivot to last element
        // 4. checking condition left<= right, same as 1st while loop , swap(arr,left,right),left++,right--;

        while (left <= right){
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            if (left <= right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        qsort(arr,f,right);
        qsort(arr,left,l);
    }
    public static void main(String[] args) {
        int[] arr = {2,8,1,10,3,12,5};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
