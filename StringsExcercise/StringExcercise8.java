/*
* Given a string and an index, return a string length 2 starting at the given index
* If the index is too big or too small to define a string length 2, use the first 2 chars.
* The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
* */

class StringExcercise8{
    public static String returnTwoIndex(String word, int index){
        if (index > word.length()-1 || (index > 2)){
            return word.substring(0,2);
        }
        else {
            return word.substring(word.indexOf(word.substring(index)), word.indexOf(word.substring(index))+2);
        }
    }
    public static void main(String[] args) {
        String c = returnTwoIndex("java", 0);
        System.out.println(c);
    }
}
