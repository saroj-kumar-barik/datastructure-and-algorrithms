package DataStructuresAndAlgorithms.DAY3;


public class SelectionSortDemo {
    int[] arr = {11,2,23,11, 34, 22, 56, 10,119,0,-11};

    public void selectionSort(int[] arr) {
        // iterating the whole array
        for (int i = 0; i < arr.length; i++) {

           // finding the minimum element in the unsorted array
           int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // i +1 because we want to check the assumed 1st element with remaining  elements
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray();
    }


    public void printArray() {
        for (int j : arr) System.out.print(j + " ");

    }

    public static void main(String[] args) {
        SelectionSortDemo ss = new SelectionSortDemo();
        ss.selectionSort(ss.arr);
    }


}
