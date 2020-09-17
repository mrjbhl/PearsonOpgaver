package Aflevering;

import java.util.Scanner;

public class Moms {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        plusMoms();
    }

    static String plusMoms() {
        System.out.print("Skriv prisen: ");
        double pris = input.nextDouble();

        double moms = pris * 0.25;
        System.out.println("Momsen er " + (int)(moms * 100) / 100.0);
        return "Moms er: " + moms;
    }
}