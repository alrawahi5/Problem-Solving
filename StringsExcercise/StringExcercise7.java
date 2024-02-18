/*
* Given a string, return the string made of its first two chars,
* so the String "Hello" yields "He".
* If the string is shorter than length 2, return whatever there is,
* so "X" yields "X", and the empty string "" yields the empty string "".
* Note that str.length() returns the length of a string.
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
* */

import java.lang.*;
class StringExcercise7 {
    public static void main(String[] args) {
       String moreThan2 = returnTwoOrLess("Abdullah");
       String lessThan2 = returnTwoOrLess("A");
       String empty2 = returnTwoOrLess("");
       System.out.println(moreThan2);
       System.out.println(lessThan2);
       System.out.println(empty2);
    }
    public static String returnTwoOrLess(String wordOrLetter){
        if(wordOrLetter.length() < 2) {
            return wordOrLetter;
        }
        return wordOrLetter.substring(0, 2);
    }
}