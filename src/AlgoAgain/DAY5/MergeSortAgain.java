package AlgoAgain.DAY5;

import java.util.Arrays;

public class MergeSortAgain {
    public static void mergeSort(int[] arr, int l, int r){
        if (l<r){
            int mid = l + (r-l)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l +1;
        int n2 = r-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i =0; i < n1; i++)
            L[i] = arr[l+i];

        for (int i =0; i < n2; i++)
            R[i] = arr[mid+1+i];


        int i = 0,j=0,k=l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k]  = L[i];
                i++;
            } else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i< n1){
            arr[k]  = L[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,7};

        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
