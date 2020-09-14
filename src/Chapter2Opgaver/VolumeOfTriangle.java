package Chapter2Opgaver;

import java.util.Scanner;

public class VolumeOfTriangle {
    public static void main(String[] args) {
        //show command
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        //start getting input
        Scanner input = new Scanner(System.in);
        //store input
        double side = input.nextDouble();
        // calculate and show output
        double area= (Math.sqrt(3)/4)*(side*side);
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + (side*area));

    }
}
