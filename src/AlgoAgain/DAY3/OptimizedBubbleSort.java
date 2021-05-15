package AlgoAgain.DAY3;

import java.util.Arrays;

public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] arr = {65, 22, 31,6};

        for (int i =0; i< arr.length;i++){
            // In Optimized bubble sort, if the array is already sorted
            // then the 2nd for loop will not run hence decreases the time
            // complexity
            boolean flag = false;
            for (int j = 0; j< arr.length-i-1;j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
