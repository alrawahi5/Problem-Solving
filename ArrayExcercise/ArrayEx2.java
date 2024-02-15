/*Return an int array length 3 containing the first 3 digits
of pi, {3, 1, 4}.
makePi() → [3, 1, 4]
*/

import java.lang.*;
class ArrayEx2 {
    public static int[] makePi(int returednNm1, int returednNm2, int returednNm3) {
        int[] returednNms = {returednNm1, returednNm2, returednNm3};
        return returednNms;
    }

    public static void main(String[] args) {
        int[] a = makePi(3, 1, 4);
        System.out.println( "[" + a[0] +", " + a[1] + ", " + a[2]+ "]"  );
    }
}