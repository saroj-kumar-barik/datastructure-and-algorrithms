package DSA450;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7, 9};
        int temp =0;
        // swapping between first and last
        // then first + 1 and last -1 and so on...
        for (int i = 0; i < array.length/2; i++) {
            temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
