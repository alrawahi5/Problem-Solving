/*
* Given an array of ints,
* return the sum of the first 2 elements in the array.
* If the array length is less than 2,
* just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
* */

import java.util.Arrays;
class ArrayEx8{

    public static int sum2(int[] originalArr){
        if (originalArr.length >= 2) {
            int a = originalArr[0] + originalArr[1];
            System.out.println(a);

        } else if (originalArr.length < 2) {
            for (int i = 0; i < 2; i++) {
                int b = originalArr[i]++;
                System.out.println(b);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};;
        sum2(array1);
        int[] array2 = {1, 1};
        sum2(array2);
        int[] array3 = {1, 1, 1, 1};
        sum2(array3);
    }

}