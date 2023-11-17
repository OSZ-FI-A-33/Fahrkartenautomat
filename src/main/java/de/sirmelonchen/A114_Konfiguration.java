package de.sirmelonchen;

public class A114_Konfiguration {


    public static void main(String[] args) {
        final String name = "Automat AVR Q2021_FAB_A";
        double prozent = 53.76;
        int cent = 80;
        int euro = 142;
        char sprachModul = 'd';
        byte PRUEFNR = 4;
        boolean status = true;

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Prüfnummer : " + PRUEFNR);
        System.out.println("Füllstand: " + prozent + " %");
        System.out.println("Summe Euro: " + euro + " Euro");
        System.out.println("Summe Rest: " + cent + " Cent");
        System.out.println("Status: " + status);

    }
}