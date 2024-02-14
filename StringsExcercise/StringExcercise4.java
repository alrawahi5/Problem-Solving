class StringExcercise4{

    public static String makeOutWordWay1(String word){

        return "the taged value is " + "<<" + word + ">>";
    }

    public static String makeOutWordWay2(String tag, String word){
        String prefix = tag.substring(1);
        String suffix = tag.substring(2);
        return "the taged value is " + prefix + word + suffix;
    }

    public static void main(String[] args) {
        String a = makeOutWordWay1("hey");
        System.out.println(a);

        String b = makeOutWordWay2("~%~%", "Abdullah");
        System.out.println(b);
    }
}