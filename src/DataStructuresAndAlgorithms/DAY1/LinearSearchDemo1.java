package DataStructuresAndAlgorithms.DAY1;

@SuppressWarnings("all")
public class LinearSearchDemo1 {

    private static int[] arr = {2, 10, 22, 10, 23};
    private static int searchElement = 2;
    private static int first = 0;
    private static int last = arr.length - 1;


    public static void main(String[] args) {
        if (searchElement == arr[first])
            System.out.println("element is present in index : " + first + " with " + (first + 1) + " attempts..");
        else if (searchElement == arr[last])
            System.out.println("element is present in index : " + last + " with " + (first + 1) + " attempts..");
        else
            System.out.println("element not found..");
    }
}
