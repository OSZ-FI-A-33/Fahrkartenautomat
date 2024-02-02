package de.sirmelonchen;

import java.util.Scanner;

public class A525_Treppe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe für Treppenhöhe und -breite
        System.out.print("Bitte geben Sie die Treppenhöhe ein: ");
        int hoehe = scanner.nextInt();

        System.out.print("Bitte geben Sie die Treppenbreite ein: ");
        int breite = scanner.nextInt();

        // Ausgabe der Treppe
        System.out.println("Treppe mit Höhe " + hoehe + " und Breite " + breite + ":");

        for (int i = 1; i <= hoehe; i++) {
            // Leerzeichen vor den Sternen
            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }

            // Sterne entsprechend der Breite
            for (int k = 1; k <= breite; k++) {
                System.out.print("*");
            }

            System.out.println();  // Zeilenumbruch für die nächste Stufe
        }

        scanner.close();
    }
}

