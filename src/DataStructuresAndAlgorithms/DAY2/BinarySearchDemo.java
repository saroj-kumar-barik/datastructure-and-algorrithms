package DataStructuresAndAlgorithms.DAY2;

public class BinarySearchDemo {
    public int getBinarySearchIndex(int[] arr, int key) {
        int requiredIndex = 0;
        int startingIndex = 0;
        int endIndex = arr.length - 1;
        if (key == arr[startingIndex])
            return 0;
        else if (key == arr[endIndex])
            return arr.length - 1;

        while ((endIndex - startingIndex) > 1) {
            int midIndex = (startingIndex + endIndex) / 2;
            int midValue = arr[midIndex];
            if (key > midValue) {
                startingIndex = midIndex;
            } else if (key < midValue) {
                endIndex = midIndex;
            } else {
                requiredIndex = midIndex;
                return requiredIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchDemo bs = new BinarySearchDemo();
        int[] arr = {23, 45, 67, 11, 88};
        int key = 23;
        if (bs.getBinarySearchIndex(arr, key) == -1) {
            System.out.println("search element not found");
        } else
            System.out.println("search element " + key + " is found in index "
                    + bs.getBinarySearchIndex(arr, key));
    }
}
