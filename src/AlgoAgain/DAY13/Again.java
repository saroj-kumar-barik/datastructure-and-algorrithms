package AlgoAgain.DAY13;

import java.util.Arrays;

/*public class Again {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int f, int l){
        int pivot = arr[l];
        int i = f-1;

        for (int j = f;j <= l-1; j++ ){
            if (arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1,l);
        return i+1;
    }

    public static void quickSort(int[] arr, int f, int l){
        if (f < l){
            int p = partition(arr, f, l);

            quickSort(arr, f, p-1);
            quickSort(arr, p+1, l);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,333,12312,-111,4};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}*/

public class Again{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int f, int l){
//        {2,333,12312,-111,4};
//        {333,12312,2,-111,4};
        int pivot = arr[(f+l)/2]; // 12312
        int i = f-1; // -1

        for (int j = f;j <= ((f+l)/2)-1; j++ ){
            if (arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1,(f+l)/2);
        return i+1;
    }
    public static void quickSort(int[] arr, int f, int l){
        if (f < l){
            int p = partition(arr, f, l);

            quickSort(arr, f, p-1);
            quickSort(arr, p+1, l);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,333,12312,-111,4};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}


