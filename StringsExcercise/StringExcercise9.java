/*
*Given a string of even length, return the first half.
* So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
* */

class StringExcercise9{
    public static String returnTwoIndex(String word){
        if (word.length() % 2 == 0){
            return word.substring(0,(word.length()/2));
        }
        else {
            return "Not Even String Length";
        }
    }
    public static void main(String[] args) {
        String c = returnTwoIndex("HelloThere");
        System.out.println(c);
    }
}