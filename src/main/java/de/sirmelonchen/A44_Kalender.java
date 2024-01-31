package de.sirmelonchen;

import java.util.Scanner;
public class A44_Kalender {
    public static void main(String[] args) {
        int tage = 0;
        int monat;
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie lautet der Monat (1-12): ");
        monat = tastatur.nextInt();

        switch(monat){
            case 2:
                tage = 28;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                tage = 30;
                break;
            case 4, 6, 9, 11:
                tage = 31;
                break;
            default:
                System.out.println("Ungültige Monatsangabe.");
                return;
        }

        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
        tastatur.close();
    }
}
