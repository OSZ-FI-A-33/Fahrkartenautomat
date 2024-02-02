package de.sirmelonchen;

import java.util.Scanner;

public class Uebung1 {

    public static void main(String[] args) {
        // Eingabe des Alters
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie alt sind Sie?: ");
        int alter = scanner.nextInt();

        // Ausgabe der geraden Zahlen bis zum Alter
        System.out.println("Gerade Zahlen bis zum Alter von " + alter + ":");

        for (int i = 2; i <= alter; i += 2) {
            System.out.println(i);
        }

        // Schließen des Scanners, um Ressourcen freizugeben
        scanner.close();
    }
}

