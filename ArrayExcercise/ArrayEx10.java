/*
*Given an int array of any length,
* return a new array of its first 2 elements.
* If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
* */

import java.util.Arrays;

class ArrayEx10{

    public static void frontPiece(int[] array){
        if (array.length >= 2){
            System.out.println("[" + array[0] + ", " + array[1] + "]");
        }
        else if (array.length == 1 ){
            System.out.println("[" + array[0] + "]");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        frontPiece(array1);
        int[] array3 = {1,2};
        frontPiece(array3);
        int[] array5 = {1};
        frontPiece(array5);
    }
}