import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        movingLastElementToStart();
    }

    private static void movingLastElementToStart() {
        // define array
        int[] ar = { 1, 2, 3, 4, 5 };
        // define copy of array
        int[] result = new int[ar.length];

//        copy elements from array to copy array without last element and insert elements from 1 index
        System.arraycopy(ar, 0, result, 1, ar.length - 1);
//        insert last element to the first position
        result[0] = ar[ar.length - 1];
//        print result
        System.out.println(Arrays.toString(result));
    }
}
