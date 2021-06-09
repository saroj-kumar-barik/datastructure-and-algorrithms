package DSA450.arrays;

import java.util.Arrays;

public class MaxAndMinElement {
    /*public static void main(String[] args) {
        int[] arr = {3,43,1,56,43,0,324,23,-234,-234,45};
        int max = 0;
        int min = 0;
        int count=0;
        int left = 0, right = arr.length-1;
        for (int i= 0;i < arr.length-1;i++){
            ++count;

            if (arr[left] > arr[right]) {
                if (min > arr[right]) {
                    min = arr[right];
                }
                left++;
                right--;
            } else {
                if (max < arr[right]) {
                    max = arr[right];
                }
                left++;
                right--;
            }
            if (left >= right)
                break;
        }
        System.out.println("No of comparisions : "+count);
        System.out.println("min value : "+min);
        System.out.println("max value : "+max);
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }*/

    static class Cal{
        int max;
        int min;
    }

    /*public static void main(String[] args) {
        int count = 1;
        int[] arr = {3,43,1,56,43,0,324,23,-234,-234,45};
        Cal cal = new Cal();
        if (arr.length == 1){
            cal.max = arr[0];
            cal.min = arr[0];
        }

        if (arr[0] > arr[1]){
            cal.max = arr[0];
            cal.min = arr[1];
        } else{
            cal.max = arr[1];
            cal.min = arr[0];
        }

        for (int i = 2; i < arr.length -1;i++){
            if (arr[i] > cal.max)
                cal.max = arr[i];
            else if (arr[i] < cal.min)
                cal.min = arr[i];
            ++count;
        }

        System.out.println(" max = "+cal.max);
        System.out.println(" min = "+cal.min);
        System.out.println(" No of comparisions : "+count);
    }*/

    public static void main(String[] args) {
        int[] arr = {3,43,1,56,43,0,324,23,-234,-234,45};
        Cal cal = new Cal();
        if (arr.length == 1){
            cal.max = arr[0];
            cal.min = arr[0];
        }

        if (arr[0] > arr[1]){
            cal.max = arr[0];
            cal.min = arr[1];
        } else{
            cal.max = arr[1];
            cal.min = arr[0];
        }

        int left = 2;
        int right = arr.length-2;
        getMinMax(arr,left,right);
    }

    public static void getMinMax(int[] arr, int left, int right){

        if (left >= right)
            return;

        int mid = (left+right)/2;

        getMinMax(arr,left,mid);
        getMinMax(arr,mid+1,right);
    }

}
