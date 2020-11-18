package DataStructuresAndAlgorithms.DAY1;

public class LinearSearchDemo {
    private static int[] arr = {2,10,22,10,23};
    private static int searchElement = 23;
//    private  static int i;

    public static void main(String[] args) {
        int res = linearSearch(arr,searchElement);
        if (res == -1)
            System.out.println("element not present");
        else
            System.out.println("the element "+searchElement+ " present in index : "+res);

    }

    public static int linearSearch(int[] arr,int searchElement){
        for ( int i = 0; i < arr.length; i++)
        {
            if (arr[i] == searchElement)
            {
                return i;
            }

        }

        return -1;

    }
}
