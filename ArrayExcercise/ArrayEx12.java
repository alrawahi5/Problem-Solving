/*
*Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
* */
import java.util.Arrays;
class ArrayEx12{
    public static boolean has23(int[] array1){
        Boolean flag = Boolean.FALSE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 2 || array1[i] == 3) {
                flag = true;
            }
        }
            System.out.println(flag);
            return flag;
        }
    public static void main(String[] args) {
        int[] array1 = {2, 5};
        has23(array1);
        int[] array2 = {4, 3};
        has23(array2);
        int[] array3 = {4, 5};
        has23(array3);
    }
}