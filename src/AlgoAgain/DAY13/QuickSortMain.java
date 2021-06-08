package AlgoAgain.DAY13;


import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        int arr[] = {11, 2, 24, 4, 90, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int left = l;
        int right = r;
        int pi = arr[(l + r) / 2];
        while (left <= right) {
            while (arr[left] < pi)
                left++;
            while (arr[right] > pi)
                right--;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        quickSort(arr,l,right);
        quickSort(arr,left,r);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
