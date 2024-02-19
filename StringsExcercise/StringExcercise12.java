/*
* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
* The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
* */

class StringExcercise12{
    public static String left2(String word){
        //new function use (.replace)
        if (word.length() >= 2){
            return word.replace(word.substring(0,2), word.substring(word.length())) + word.substring(0,2);
        }
        else {
            return "Both words' length have to be more than 1";
        }
    }
    public static void main(String[] args) {
        String a = left2("Hello");
        String b = left2("java");
        String c = left2("Hi");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}