/*Given a string,
return a version without both the first and last char of the string.
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
*/

class StringExcercise15{

    public static String withouEnd2(String word){
            return word.substring(1, word.length()-1);

    }
    public static void main(String[] args) {
        String c = withouEnd2("Hello");
        System.out.println(c);
        String b = withouEnd2("abc");
        System.out.println(b);
        String a = withouEnd2("ab");
        System.out.println(a);
    }
}