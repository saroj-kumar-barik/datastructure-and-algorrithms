package DataStructuresAndAlgorithms.DAY3;

import java.util.Scanner;

public class SelectionSortAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements for the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr[" + i + "] element :");
            arr[i] = sc.nextInt();
        }
        SelectionSortAgain ssa = new SelectionSortAgain();
        System.out.println("ARRAY BEFORE SORTING ...");
        ssa.printArray(arr);
        ssa.selectionSort(arr);
        System.out.println("ARRAY AFTER SORTING ...");
        ssa.printArray(arr);
    }

    public void selectionSort(int[] arr) {
        // 1st for loop will run for all the elements
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
        // 2nd for loop will run from the next element and it iterate over all the elements and finds the smallest
            // the smallest one
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
        // then inside first for loop and outside 2nd loop, swapping will be done.
            int temp;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}

