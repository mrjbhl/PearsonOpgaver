package Aflevering;

import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv prisen: ");
        double pris = input.nextDouble();

        double moms = pris * 0.25;
        System.out.println("Momsen er " + (int)(moms * 100) / 100.0);
        plusMoms();
    }

    public static void plusMoms() {

    }
}