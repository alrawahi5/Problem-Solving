/*
* Given a string of even length, return a string made of the middle two chars, 
* so the string "string" yields "ri". 
* The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
* */

class StringExcercise16{

    public static String middleTwo(String word){
        if (word.length() == 6) {
            return word.substring(word.length()/3,((2)*word.length())/3 );
        }
        else if (word.length() == 4){
            //return word.substring((word.length()/2), word.length()-1);
            return word.substring((word.length()/2)-1,word.length()-1);
        }
        else if (word.length() == 8){
            return word.substring((word.length()/2)-1, word.length()-3);
        }
        return "Issue!";

    }
    public static void main(String[] args) {
        String c = middleTwo("string");
        System.out.println(c);
        String b = middleTwo("code");
        System.out.println(b);
        String a = middleTwo("Practice");
        System.out.println(a);
    }
}