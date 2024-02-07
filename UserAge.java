import java.lang.*;
class UserAge {
    public static void main(String[] args) {
        //userAge
        int userAge = 25; 

        System.out.println("My age is: " + userAge);
        //exam avg
        int exam1 = 90; 
        int exam2 = 93; 
        int exam3 = 95; 
        
        float result = (float)(exam1 + exam2 + exam3)/3;
        System.out.println("My average exam result is: " + result);
        //is a char
        char character1 = 'A';
        char character2 = '5'; 
        
        boolean first = Character.isDigit(character1);
        boolean second = Character.isDigit(character2);
        
        if (first == false){
            String str1 = character1 + " is a digit is " + first;
            System.out.println(str1);
            String str2 = character2 + " is a digit is " + second;
            System.out.println(str2);
        }
        else{
            System.out.println(" ");
        }
        // 
        //circumference
        final double PI = 3.14; 
        double radius = 5;
        double circumference = 2*PI*radius; 
        
        System.out.println("The circumference is: " + circumference);
        
        // temperatureInCelsius
        int fahrenheit = 37;
        float celsius = (float)(fahrenheit -32) * (9/5);
        System.out.println("The temperature In Celsius is: " + celsius);
        
        double result1 = celsius % 2;
        if (result1 == 0) {
          System.out.println("The result is even" + "{" + result1 + "}");  
        }
        else{
            System.out.println("The result is odd" + "{" + result1 + "}");
        }
        
        //rectangle
        double length = 3.14; 
        double width = 14.3;
        double rectangleArea = length * width; 
        System.out.println("The area of the rectangle is: " + rectangleArea);
        
        
    }
}