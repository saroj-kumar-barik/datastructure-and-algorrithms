package AlgoAgain.DAY13;

import java.util.Arrays;

// 1 . Choose any one element as pivot element (choose it inisde a method that will
//  work recursively here quick_sort())
// 2. The element may be start index, last index, or any index
// 3. If there is atleast one elment btn first and last i.e first < last is true
// then call a method such that it will place the pivot element in its correct position
// here our partition() do the work for us and it returns the index of pivot,
// then call the same method for left and right sub-array of the pivot element
// i.e one from 0 to pivot-1 and another pivot+1 to last
public class QuickSortAgain {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int first, int last){
        int pivot = arr[last];
        int i = first -1;
        for (int j = first; j <= last-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr,i+1,last);
        return (i+1);
    }
    public static void quickSort(int[] arr, int first, int last){
        if (first < last){
            int pivot = partition(arr, first, last);

            quickSort(arr, first, pivot-1);
            quickSort(arr, pivot+1, last);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,12,99,2,33};
        quickSort(arr,0,arr.length-1);
        System.out.println("sorted array by quick sort : ");
        System.out.println(Arrays.toString(arr));
    }
}
