/*
* Given a string, return a "rotated right 2" version
*  where the last 2 chars are moved to the start.
* The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
* */

import java.util.Arrays;

class StringExcercise13 {
    public static String rotateBy2(String wordToRotate) {
        //new function use (.replace)
/*        if (word.length() >= 2){
            return word.replace(word.substring(0,2), word.substring((word.length())) + word.substring(0,2));

        }
        else {
            return "Both words' length have to be more than 1";
        }*/
        Integer rotateBy = 2;
        char[] originalArray = wordToRotate.toCharArray();
        char[] rotatedArray = new char[originalArray.length];

        if (rotateBy == originalArray.length) {
            return Arrays.toString(originalArray);
        } else {
            int addedNum = originalArray.length % rotateBy;
            int var = 0;
            for (int i = rotateBy+addedNum; i < originalArray.length; i++) {
                rotatedArray[var] = originalArray[i];
                var++;
            }
            for (int i = 0; i < rotateBy+addedNum; i++) {
                rotatedArray[var] = originalArray[i];
                var++;
            }
        }
        return Arrays.toString(rotatedArray);
    }
    public static void main(String[] args) {
        String a = rotateBy2("Hello");
        String b = rotateBy2("java");
        String c = rotateBy2("Hi");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}