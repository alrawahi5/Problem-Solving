class StringExcercise5{

    public static String extraEnd(String word){
      return word.substring(word.length()-2) + word.substring(word.length()-2) + word.substring(word.length()-2);


    }
    public static void main(String[] args) {
        String c = extraEnd("Hi");
        System.out.println(c);
    }
}