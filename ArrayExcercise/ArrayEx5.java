/*
*Given an array of ints length 3,
* return an array with the elements "rotated left"
* so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
* */

import java.lang.*;
import java.util.Arrays;

class ArrayEx5 {
    //    public static int[] rotateLeft3(int [] originalArray) {
//
//        int[] rotatedArray = {2, 3, 1};
//        rotatedArray = new int[]{originalArray[0] = rotatedArray[2], originalArray[1] = rotatedArray[0], originalArray[2] = rotatedArray[1] };
//        //rotatedArray = originalArray;
//        for(int i = 0; i < rotatedArray.length; i++){
//            int a = rotatedArray[0];
//            int b = rotatedArray[1];
//            int c = rotatedArray[2];
//            System.out.println("[" + a+b+c + "]");
//        }
//        return rotatedArray;
//    }
    public static void main(String[] args) {
        //int [] originalArray = {1, 2, 3};
        //int []result = rotateLeft3(originalArray);
        //System.out.println(result);
        rotateLeft3();
    }

    public static void rotateLeft3() {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 1;
        int[] rotatedArray = new int[7];

        if (rotateBy == 0 || rotateBy == originalArray.length)

            return;
        int var = 0;
        for (int i = rotateBy + 1; i <= originalArray.length - 1; i++) {
            rotatedArray[var] = originalArray[i];
            var++;
        }
        for (int i = 0; i <= rotateBy; i++) {
            rotatedArray[var] = originalArray[i];
            var++;
        }
        print(originalArray, "original");
        print(rotatedArray, "rotated");

    }

    public static void print(int[] myInts, String nameOfArray) {
        System.out.println("\nName of Array" + nameOfArray);
        for (int x : myInts) {
            System.out.print(x + " ");
        }
    }

}