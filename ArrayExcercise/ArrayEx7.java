/*
*Given an array of ints length 3, figure out which is larger,
* the first or last element in the array,
* and set all the other elements to be that value.
* Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
* */

import java.util.Arrays;
class ArrayEx7{
    public static void main(String[] args) {
        int[] originalArr = {1,2,3};
        int[] modifiedLargestArr = new int[originalArr.length];
        Arrays.sort(originalArr);
        
        for(int i = 0; i < modifiedLargestArr.length; i++){
            modifiedLargestArr[i] = originalArr[originalArr.length-1];
        }
        System.out.print(Arrays.toString(modifiedLargestArr));
    }

}