package AlgoAgain.DAY4;

import java.util.Arrays;

public class InsertionSortAgain {
    public static void main(String[] args) {
        int[] arr = {2, 33, 4, 55, 6, 1, 3};
        // 1. Run the loop from i = 1 to len -1. Make the current element as key
        // 2. compare the key with the predecessor
        // 3. if the key is smaller than the predecessor compare it with all other elements before
        // and move the greater element one step ahead to make space for the key
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j = j -1 ;
            }
            arr[j+1] = key;

        }
        System.out.println(Arrays.toString(arr));
    }
}
