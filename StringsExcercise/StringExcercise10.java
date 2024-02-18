/*
* Given 2 strings, a and b, return a string of the form short+long+short,
* with the shorter string on the outside and the longer string on the inside.
* The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
* */

class StringExcercise10{
    public static String comboString(String word1, String word2){
        if (word1.length() > word2.length()){
            return word2 + word1 + word2;
        }
        else {
            return word1 + word2 + word1;
        }
    }
    public static void main(String[] args) {
        String a = comboString("Hello", "hi");
        String b =comboString("Hello", "hi");
        String c = comboString("aaa", "b");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}