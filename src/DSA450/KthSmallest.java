package DSA450;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,6,8,11,43,1};
        int size = arr.length;
        int kthElement = 5;
        Arrays.sort(arr);
        System.out.println("The 5th smallest element in the array is "+arr[kthElement-1]);
    }
}
