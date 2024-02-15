/*
*Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
* */
import java.lang.*;
import java.util.Arrays;
class ArrayEx4 {
    public static int sum3(int [] summedArray) {
        int summedArray1 = summedArray[0] + summedArray[1] + summedArray[2];
        return summedArray1;
    }
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3};
       int result = sum3(array1);
        System.out.println(result);
    }
}
