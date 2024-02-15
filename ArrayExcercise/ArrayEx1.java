/*
* Given an array of ints,
* return true if the array is length 1 or more,
* and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*
* */
import java.lang.*;

class ArrayEx1{

    public static String sameFirstLast(int[] threeNumbers){
        if ((threeNumbers.length >= 1 && threeNumbers [0] == threeNumbers[threeNumbers.length-1])){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        return "";
    }

    public static void main(String[] args) {
        int[] threeNumbers = {1,2, 3,3,3};
        sameFirstLast(threeNumbers);
    }


}