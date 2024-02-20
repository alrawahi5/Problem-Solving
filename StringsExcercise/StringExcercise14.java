/*
* Given a string, return a string length 1 from its front,
* unless front is false, in which case return a string length 1 from its back.
* The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
* */

class StringExcercise14{

    public static String theEnd(String word, boolean what){
        if (what == true && word.length() > 1) {
            return word.substring(0,1);
        }
        else {
            return word.substring(word.length()-1);
        }
    }
    public static void main(String[] args) {
        String c = theEnd("Hello", true);
        System.out.println(c);
        String b = theEnd("Hello", false);
        System.out.println(b);
        String a = theEnd("oh", true);
        System.out.println(a);
    }
}