package Workshop;
import java.util.Scanner;

public class Refactor2Dansk {
    public static void main(String[] args) {
        VisTid();
        UdregnTid();
        FahTilCel();
        UdregnLaan();
        UdregnSmaapenge();

    }

    public static void UdregnTid() {
        Scanner input = new Scanner(System.in);
        // Spørg efter input
        System.out.print("Skriv et heltal sekunder ");
        int sekunder = input.nextInt();

        int minutter = sekunder / 60; // Find minutter i sekunder
        int SekunderTilbage = sekunder % 60; // sekunder tilbage
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + SekunderTilbage + " sekunder");
    }

    public static void FahTilCel() {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv et antal grader Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er lig med " +
                celsius + " Celsius");
    }
    public static void VisTid() {
        // MilliSekunder siden midnat
        long totalMillisekunder = System.currentTimeMillis();

        // Sekunder siden midnat
        long totalSekunder = totalMillisekunder / 1000;

        // Udregn nuværende sekunder i minuttet i timen
        long nuSekunder = totalSekunder % 60;

        // Total minutter
        long totalMinutter = totalSekunder / 60;

        // udregn nuværende minutter i timen
        long nuMinutter = totalMinutter % 60;

        // total timer
        long totalTimer = totalMinutter / 60;

        // udregn nuværende timer
        long nuTimer = totalTimer % 24;

        // Vis resultat
        System.out.println("Klokken er " + nuTimer + ":"
                + nuMinutter + ":" + nuSekunder + " GMT");
    }
    public static void UdregnLaan() {
        // lav en Scanner
        Scanner input = new Scanner(System.in);

        // Årlig rente
        System.out.print("Skriv årlig rente: ");
        double aarligRente = input.nextDouble();

        // Månedlig Rente
        double maanedligRente = aarligRente / 1200;

        // Antal år
        System.out.print(
                "Skriv antal år, som heltal: ");
        int antalAar = input.nextInt();

        // Skriv lån størrelse
        System.out.print("Skrive lånets størrelse: ");
        double laanStoerelse = input.nextDouble();

        // Udregn afbetaling
        double maanedligAfbetaling = laanStoerelse * maanedligRente / (1
                - 1 / Math.pow(1 + maanedligRente, antalAar * 12));
        double totalAfbetaling = maanedligAfbetaling * antalAar * 12;

        // Vis resultat
        System.out.println("Månedlig afbetaling er KR" +
                (int)(maanedligAfbetaling * 100) / 100.0);
        System.out.println("Den totale tilbagebetaling er KR" +
                (int)(totalAfbetaling * 100) / 100.0);
    }
    public static void UdregnSmaapenge() {
        // Lav Scanner
        Scanner input = new Scanner(System.in);

        // Få beløb
        System.out.print(
                "Skriv beløb: ");
        double beloeb = input.nextDouble();

        int restBeloeb = (int)(beloeb * 100);

        // find antal kroner
        int antalKroner = restBeloeb / 100;
        restBeloeb = restBeloeb % 100;

        // Find antal øre
        int antalOere = restBeloeb;


        // vis resultat
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalKroner + " Kroner");
        System.out.println("    " + antalOere + " Øre ");

    }
}



