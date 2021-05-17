package AlgoAgain.DAY7;

import java.util.Arrays;

public class FindingMinimunLengthUnseratedArrayThenSort {
    public static void main(String[] args) {
        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < arr.length; i++) {

            int min = i;
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                // 22 < 65
                if (arr[j] < arr[min]) {
                    startIndex = i;
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }

        for (int i = arr.length - 1; i > startIndex; i--) {

            int max = i;
            boolean flag = false;
            for (int j = i - 1; j > startIndex; j--) {
                // 22 < 65
                if (arr[j] > arr[max]) {
                    endIndex = i;
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }

        System.out.println(endIndex + " " + startIndex);

        int[] unsortedArr = new int[endIndex-startIndex+1];

        int temp = startIndex;
        for (int i =0; i< unsortedArr.length;i++){
            unsortedArr[i] = arr[temp];
            temp++;
        }



        System.out.println(Arrays.toString(unsortedArr));

        Arrays.sort(unsortedArr);

        System.out.println(Arrays.toString(unsortedArr));

        for (int i = 0; i < unsortedArr.length;i++){
            arr[startIndex] = unsortedArr[i];
            startIndex++;
        }
        System.out.println("The length of minimum unsorted arr is "+unsortedArr.length);
        System.out.println(Arrays.toString(arr));
    }
}
