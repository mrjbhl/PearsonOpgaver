package Aflevering;

import java.util.Scanner;

public class Moms {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        plusDanskMoms();
        plusTyskMoms();
    }

    static String plusDanskMoms() {
        System.out.print("Skriv prisen (Dansk): ");
        double pris = input.nextDouble();

        double moms = pris * 0.25;
        System.out.println("Momsen for Danmark er " + (int)(moms * 100) / 100.0);
        return "";
    }
    static String plusTyskMoms() {
        System.out.print("Skriv prisen (Tysk): ");
        double pris = input.nextDouble();

        double moms = pris * 0.16;
        System.out.println("Momsen for Tyskland er " + (int)(moms * 100) / 100.0);
        return "";
    }
}