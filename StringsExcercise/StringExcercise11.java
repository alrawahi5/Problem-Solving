/*
*Given 2 strings, return their concatenation,
* except omit the first char of each. The strings will be at least length 1.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
* */

class StringExcercise11{
    public static String nonStart(String word1, String word2){
        if (word1.length() > 1 &&  word2.length() > 1){
            return word1.substring(1, word1.length()) + word2.substring(1, word2.length());
        }
        else {
            return "Both words' length have to be more than 1";
        }
    }
    public static void main(String[] args) {
        String a = nonStart("Hello", "there");
        String b =nonStart("java", "code");
        String c = nonStart("shotl", "java");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}