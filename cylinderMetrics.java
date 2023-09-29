import java.util.Scanner;
public class cylinderMetrics {
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );

        System.out.println("What is the radius of your cone's base? ");
        double baseRadius = input.nextDouble();
        System.out.println("What is the slant height? ");
        double slantHeight = input.nextDouble();
        System.out.println("What is the perpendicular height of the cone? ");
        double perpendicularHeight = input.nextDouble();

        double curvedSurfaceArea = Math.PI * baseRadius * slantHeight;
        float oneThird = 1 / 3f;
        double volume = oneThird * Math.PI * baseRadius * baseRadius * perpendicularHeight;

        System.out.println("For a cone with a perpendicular height of " + perpendicularHeight + ", a slant height of " + slantHeight + " and a base with a radius of " + baseRadius +
                "\n Curved Surface Area = " + curvedSurfaceArea +
                "\n Volume = " + volume);


    }
}
