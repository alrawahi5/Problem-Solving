/*
*Given 2 arrays of ints, a and b,
* return true if they have the same first element
* or they have the same last element.
* Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
* */
import java.lang.*;
import java.util.Arrays;

class ArrayEx3 {
    public static boolean commonEnd(int [] array1, int [] array2) {
        Boolean flag = Boolean.FALSE;
        if (((array1.length >=1) && (array2.length >= 1)) && ((array1[0] == array2[0])) && ((array1[array1.length-1] == array2[array2.length-1]))){
            flag = true;
        }

        System.out.println(flag);
        return flag;
    }
    public static void main(String[] args) {
        //commonEnd(Arrays.asList(1,2,3).toArray());
        int [] array1 = {1, 2, 3};
        int [] array2 = {1, 2, 3};
        commonEnd(array1, array2);
    }
}