class StringExcercise3{
    public static void main(String[] args) {
        String a = makeTags("i", "hey");
        System.out.println(a);
    }
    public static String makeTags(String tag, String word){
        return "the taged value is " + "<" + tag + ">" + word + "<" + tag + ">";
    }


}