package de.sirmelonchen;

import java.util.Scanner;

public class A524_Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe für die Ziffer zwischen 2 und 9
        System.out.print("Bitte geben Sie eine Ziffer zwischen 2 und 9 ein: ");
        int ziffer = scanner.nextInt();

        // Überprüfung, ob die eingegebene Ziffer im gültigen Bereich liegt
        if (ziffer < 2 || ziffer > 9) {
            System.out.println("Ungültige Eingabe. Die Ziffer muss zwischen 2 und 9 liegen.");
        } else {
            // Ausgabe der Multiplikationsmatrix mit den gegebenen Bedingungen
            System.out.println("Multiplikationsmatrix für die Ziffer " + ziffer + ":");
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int produkt = i * j;

                    // Bedingungen überprüfen
                    if (produkt % ziffer == 0 || enthältZiffer(produkt, ziffer) || quersumme(produkt) == ziffer) {
                        System.out.print("* ");
                    } else {
                        System.out.print(produkt + " ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    // Methode zum Überprüfen, ob eine Zahl die Ziffer enthält
    private static boolean enthältZiffer(int zahl, int ziffer) {
        while (zahl > 0) {
            if (zahl % 10 == ziffer) {
                return true;
            }
            zahl /= 10;
        }
        return false;
    }

    // Methode zur Berechnung der Quersumme einer Zahl
    private static int quersumme(int zahl) {
        int summe = 0;
        while (zahl > 0) {
            summe += zahl % 10;
            zahl /= 10;
        }
        return summe;
    }
}

