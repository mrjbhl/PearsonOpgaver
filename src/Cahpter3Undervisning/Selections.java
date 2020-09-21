package Cahpter3Undervisning;

import java.awt.*;
import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Eksempel.metode();
        double hour = 0;
        int minut = 57;

        //if
        if (hour >= 9) {
            if (hour < 15) {
                System.out.println("Du er i skole");
            } else {
                System.out.println("Du har fri");
            }
        } else {
            System.out.println("Du har fri");
        }
        if (hour == 0 && minut < 60) System.out.println("Det er midnat bro");

        // switch

        String color = "red";
        int tal = 0;

        switch (color) {
            case "red":
                System.out.println("Sport");
                break;
            case "green":
                System.out.println("Offroad");
                break;
            case "blue":
                System.out.println("Boat");
                break;
            default:
                System.out.println("Random Bil");
        }

    }
}
