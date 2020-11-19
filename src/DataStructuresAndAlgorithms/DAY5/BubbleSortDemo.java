package DataStructuresAndAlgorithms.DAY5;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {22, 11, 45, 67, 1, 0, -1};
// 1st for loop will run one time less than the no of elements so here arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // 2nd for loop will run 2 times less than the no of array elements so here
            // arr.length - i -1
            for (int j = 0; j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    // then apply swapping inside 2nd for loop
                    // * SWAPPING(to do quickly with out thinking), here the left side operand in the for loop is a
                    // and right part is b
                    // let temp = c
                    // so shortcut is
                    // c = a
                    // a = b
                    // b = c
                    int temp;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
