package collections;

import java.util.Arrays;

public class ArrayVS {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr); //It actually prints the memory address of the array reference.
        System.out.println(Arrays.toString(arr));

        arr[2] = 3; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(arr));
    }
}
