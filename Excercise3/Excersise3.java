import java.lang.*;

class Excersise3 {
        public static void main(String[] args) {
                //sphere
                double radius1 = 5.5;
                double volume = (3/4) * 3.14 * Math.pow(radius1, 3);

                System.out.println("The volume of the sphere is: " + volume);

                //is a numbeer a perfect square?
                int nubmber = 4;
                if (4 == Math.pow(2,2)){
                        System.out.println("4 is a  perfect sqare of 2 ");
                }
                else{
                        System.out.println("4 is Not a  perfect sqare of 2 ");
                }

                // total distance
                double avgSpeed = 140.5;
                double timeTraveled = 0.28;
                double totalDist = avgSpeed * timeTraveled;
                System.out.println("The total traveled distance is: " + totalDist);

                //mean, median, mod
                double card1 = 5, card2 = 50, card3 = 500;
                double mean = (card1+card2+card3)/3;
                double median = card2;
                double mod = (card1 * card2 * card3) %3;

                System.out.println("The mean of the 3 cards is: " + mean);
                System.out.println("The median of the 3 cards is: " + median);
                System.out.println("The mod of the 3 cards is: " + mod);

                //inch to centi
                int inch = 589;
                double centimeters = (2.54) * inch;
                System.out.println("The centimeters of the the given inch is: " + centimeters);

                //total price
                double pants = 2.5;
                double hat = 7.01;
                double socks = 1.99;
                double totalPrice = pants + hat + socks;
                System.out.println("The total price is: " + totalPrice);

                //total distance given velocity, acceleration, time;
                double velocity = 87.89;
                double acceleration = 3.12;
                double time3 = 4.33;
                double totalDist1 = velocity * time3 + (1/2) *acceleration * Math.pow(time3, 2);
                System.out.println("The total distance traveled is: " + totalDist1);

                // cost of paint
                int meters = 88;
                int paintPrice = 1;
                double totPrice = (Math.pow(88, 2)) * paintPrice;
                System.out.println("The total price per square meters is: " + totPrice);

        }
}