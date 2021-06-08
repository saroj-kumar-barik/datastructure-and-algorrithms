package AlgoAgain.DAY5;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l +1 ;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        // when the else part of the above while loop runs, the left element will not be
        // there in the sorted array(arr[k]), so the left element will remain as such.
        // so in order to insert the left value to the sorted array the below while loop runs.

        // EXAMPLE :  //  int[] arr = {22, 3, 11, 44,11,6}; - given array
        // for the first time when L[0] = 22 and R[0] = 3 then arr[k=0] = 3 which is the right sub array elemnt
        // we got this in arr[k=0] when else part of the above loop run, so now the left sub array
        // element remains as such. so in order to place the element in the corerct position
        // the below loop runs
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // here the mid is taken l + (r-l)/2 not  (r-l)/2  bcz
            // for the second recursive call we want the mid index m+1 or greater but
            // if we write (r-l)/2 then index will give zero which is not true.
            // ShortCut : To understand why mid is written l + (r-l)/2 not  (r-l)/2

            // run the second recursive fucn, you will get the ans

            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 3, 11, 44,11,6};
        //                      3
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}
