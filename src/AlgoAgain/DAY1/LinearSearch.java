package AlgoAgain.DAY1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 44, 5, 66};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to search");

        int search = sc.nextInt();

        boolean flag = false;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;

            if (search == arr[i]) {
                flag = true;
                System.out.println("element found at index " + i + " with " + count + " attempts");
                break;
            }

            if (search == arr[arr.length-1-i]){
                flag = true;
                System.out.println("element found at index " + (arr.length-1-i) + " with " + count + " attempts");
                break;
            }

        }
        if (!flag) {
            System.out.println("element not found");
        }
    }
}
