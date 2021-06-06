package AlgoAgain.DAY12;

// Java implementation of QuickSort
//

public class quickSort {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
            arr[] --> Array to be sorted,
            low --> Starting index,
            high --> Ending index
    */
    static void quick_Sort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            quick_Sort(arr, low, pi - 1);
            quick_Sort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 3, 4, 1, 5 };
//        int[] arr = { 3, 4, 1, 5, 10, 7, 8};
//        int[] arr = { 3, 4, 1, 5, 7, 8, 10};




//        int[] arr = { 1, 3, 4, 5, 7, 8, 10 }; i = 2 n .s = i+1 = 3
        int n = arr.length;

        quick_Sort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

// This code is contributed by Ayush Choudhary
