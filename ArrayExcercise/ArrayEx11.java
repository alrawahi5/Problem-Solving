/*
* Given an array of ints,
* return a new array length 2 containing the first and last elements from the original array.
* The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
* */

import java.util.Arrays;
class ArrayEx11{
    public static void makeEnds(int[] array1){
        if (array1.length >= 1){
            System.out.println("[" + array1[0] + ", " + array1[array1.length-1] + "]");
        }
        else {
            System.out.println("The Array needs to be at leaset of length 1 ");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        makeEnds(array1);
        int[] array2 = {1, 2, 3, 4};
        makeEnds(array2);
        int[] array3 = {7, 4, 6, 2};
        makeEnds(array3);
    }
}