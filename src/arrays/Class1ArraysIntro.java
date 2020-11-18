package arrays;

// Definition - An array is a group of like-typed variables that are referred to by a common name.
// Important points to remember in arrays :
// 1. In Java all arrays are dynamically allocated.
// dynamically mean -  the size is not fixed. we declare it at one place and can assign memory later on using new
// keyword
// 2. since arrays are objects( even everything is object in java ), so we can find the length  using "length" method
// 3. Java array can be also be used as a static field, a local variable or a method parameter.
// 4. The size of an array must be specified by an int value and not long or short.
// 5. Every array type implements the interfaces Cloneable and java.io.Serializable.

// 6. Array can contain primitives (int, char, etc.) as well as object (or non-primitive) references of a class
// depending on the definition of the array
public class Class1ArraysIntro {
       // TODO point no 3 discussed
    public static int[] array = new int[20]; // array as a static field
    public static void main(String[] args) {
        int[] array1; // array as a local variable
        array1 = new int[10];
        m1(array1);
        // TODO point no 4 discussed below
        System.out.println(Integer.MAX_VALUE);
//        array1 = new int [2147483647]; - allowed, but it will take all the memory of jvm
//        array1 = new int [2147483648]; // not allowed - more than int value not allowed
        array1 = new int[0]; // allowed
//        array1 = new int[-1]; // not allowed - throws exception - "NegativeArraySizeException"
    }

    public static void m1(int[] array){  // method holding parameter of type array
        System.out.println("method that holds parameter as array");
    }
    // TODO point no 6 discussed below
    // array types :
    short[] array1;
    int[] array2;
    long[] array3;
    char[] array4;
    float[] array5;
    double[] array6;
    boolean[] array7;

    Student[] arr = new Student[3];
//    arr[0] = 1,"Bablu"
}

class Student {

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

}
