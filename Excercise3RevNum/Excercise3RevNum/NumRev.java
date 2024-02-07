package Excercise3RevNum.Excercise3RevNum;

class NumRev {
    public static void main(String[] args) {
        
        int number = 56789; 
        int rev = 0;
        int rem = 0; 
        
        while (number > 0){
        rem = number % 10;
        rev = (rev * 10) + rem;
        number = number/ 10;
        }
        System.out.println("The reversed Number is: " + rev);
    }
}