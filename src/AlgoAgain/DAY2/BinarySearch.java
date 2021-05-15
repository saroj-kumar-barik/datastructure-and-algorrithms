package AlgoAgain.DAY2;

import java.util.Scanner;

public class BinarySearch {
    static int  count = 0;
    private static int binarySearch(int[] arr, int search) {

        int left = 0;
        int right = arr.length - 1;

        if (search == arr[left]) {
            count++;
            return 0;
        } else if (search == arr[right]) {
            count++;
            return arr.length - 1;
        }

        while ((right - left) > 1) {
            count++;
            int mid = (left + right) / 2;
            if (search > arr[mid]) {
                left = mid;
            }

            else if (search < arr[mid]){
                right=mid;
            }

            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be searched : ");
        int search = sc.nextInt();

        int[] arr = {2, 3, 4, 55, 66, 77};

        int temp = binarySearch(arr,search);

        if (temp==-1){
            System.out.println("element not found..");
        }

        else {
            System.out.println("the element "+search + " is found at index "+temp+ " with "+count+ " attempts");
        }
    }
}
