package de.sirmelonchen;

public class A522_EinMalEins {
    public static void main(String[] args) {
        // Äußere Schleife für die Multiplikanden (1 bis 10)
        for (int i = 1; i <= 10; i++) {
            // Innere Schleife für die Multiplikatoren (1 bis 10)
            for (int j = 1; j <= 10; j++) {
                // Das Produkt ausgeben und durch Tabulatoren trennen
                System.out.print(i * j + "\t");
            }
            // Am Ende jeder Zeile einen Zeilenumbruch ausgeben
            System.out.println();
        }
    }
}
