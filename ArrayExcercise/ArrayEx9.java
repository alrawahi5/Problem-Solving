/*
* Given 2 int arrays, a and b, each length 3,
* return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
* */

import java.util.Arrays;

class ArrayEx9{

    public static void middleWay(int[] firstArray, int[] secondArray){
        if (firstArray.length == 3 && secondArray.length == 3){
            System.out.println("[" + firstArray[1] + ", " + secondArray[1] + "]");
        }
        else{
            System.out.println("Arrays need to be of length  3 ");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        middleWay(array1, array2);
        int[] array3 = {7, 7, 7};
        int[] array4 = {3, 8, 0};
        middleWay(array3, array4);
        int[] array5 = {5, 2, 9};
        int[] array6 = {1, 4, 5};
        middleWay(array5, array6);
    }

}