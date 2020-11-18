package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Class2Rotation {
    private int[] arr;
    public static void main(String[] args) {
        Class2Rotation obj = new Class2Rotation();
        obj.arr = new int[]{3,5,7,8,2,1};
        System.out.println("Elements before rotating : ");
        System.out.println(Arrays.toString(obj.arr));
        obj.rotation(obj.arr, obj.arr.length, 2);
    }
    public  void rotation(int arr[],int size,int rotateBy){
        int[] newArr = new int[size-rotateBy];
        for (int i = 0; i < newArr.length ; i++)
        {
            newArr[i] = arr[i+rotateBy]; // 2 3 4 5 loc
//            System.out.println(Arrays.toString(newArr));
        }
        int[] newArr1 = new int[rotateBy];
        for (int i = 0; i < rotateBy; i++)
        {
            newArr1[i] = arr[i]; // 0 1 loc
//            System.out.println(Arrays.toString(newArr1));
        }
        int[] finalArray = new int[size];
        for (int i = 0; i < newArr.length; i++)
        {
            finalArray[i] = newArr[i];
        }
        for (int i = 0; i < newArr1.length; i++)
        {
            finalArray[i+newArr.length] = newArr1[i];
        }
        System.out.println("Elements after rotating : ");
        System.out.println(Arrays.toString(finalArray));

    }
}
