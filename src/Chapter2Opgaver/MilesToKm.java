package Chapter2Opgaver; import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        //show command
        System.out.print("Enter miles: ");
        //start getting input
        Scanner input = new Scanner(System.in);
        //store input
        double miles = input.nextDouble();
        //show output
        System.out.println(miles +" miles is " + (miles*1.6) + " Kilometer");
    }
}
