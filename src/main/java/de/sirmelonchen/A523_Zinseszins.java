package de.sirmelonchen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A523_Zinseszins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anlagesumme
        System.out.print("Geben Sie an, wieviel Kapital Sie anlegen: ");
        double anlagesumme = scanner.nextDouble();

        // Eingabe des jährlichen Zinssatzes
        System.out.print("Geben Sie den Zinssatz an: ");
        double zinssatzProzent = scanner.nextDouble();

        // Eingabe der Laufzeit in Jahren
        System.out.print("Geben Sie die Laufzeit für den Vertrag ein: ");
        int laufzeitJahre = scanner.nextInt();

        // Zinseszinseffekt berechnen
        double zinssatz = zinssatzProzent / 100.0;
        double endkapital = berechneEndkapital(anlagesumme, zinssatz, laufzeitJahre);
        DecimalFormat df = new DecimalFormat("#.##");
        String formatiertesEndkapital = df.format(endkapital);
        String formatiertesanlagekapital = df.format(anlagesumme);

        // Ausgabe des Ergebnisses
        System.out.println("Eingezahltes Kapital: " + anlagesumme);
        System.out.println("Das Endkapital nach " + laufzeitJahre + " Jahren beträgt: " + formatiertesEndkapital);

        // Scanner schließen
        scanner.close();
    }

    // Methode zur Berechnung des Endkapitals mit Zinseszinseffekt
    private static double berechneEndkapital(double anlagesumme, double zinssatz, int laufzeitJahre) {
        double kapital = anlagesumme;

        for (int jahr = 1; jahr <= laufzeitJahre; jahr++) {
            // Zinsen berechnen und zum Kapital addieren
            double zinsen = kapital * zinssatz;
            kapital += zinsen;
        }

        return kapital;
    }
}
