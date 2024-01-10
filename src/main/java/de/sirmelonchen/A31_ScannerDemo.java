package de.sirmelonchen; // Mein Privates Package in dem die Klasse liegt.

import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class A31_ScannerDemo {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");// fagt nach eingabe
        int ganzzahl = tastatur.nextInt();//da erfolgt die eingabe
        System.out.println("Sie haben " + ganzzahl + " eingegeben!");//hier wird die eingabe ausgegeben
        System.out.println();//neue zeile

        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");// fagt nach eingabe
        double kommazahl = tastatur.nextDouble();//da erfolgt die eingabe
        System.out.println("Sie haben " + kommazahl + " eingegeben!");//hier wird die eingabe ausgegeben
        System.out.println();//neue zeile

        System.out.print("Bitte geben Sie ein Wort ein: ");// fagt nach eingabe
        String wort = tastatur.next();//da erfolgt die eingabe
        System.out.println("Sie haben '" + wort + "' eingegeben!");//hier wird die eingabe ausgegeben
        System.out.println();//neue zeile

        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");// fagt nach eingabe
        boolean wahrheitswert = tastatur.nextBoolean(); //da erfolgt die eingabe
        System.out.println("Sie haben '" + wahrheitswert + "' eingegeben!");//hier wird die eingabe ausgegeben
        System.out.println(); //neue zeile

        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");// fagt nach eingabe
        char buchstabe = tastatur.next().charAt(0);//da erfolgt die eingabe
        System.out.println("Sie haben '" + buchstabe + "' eingegeben!");//hier wird die eingabe ausgegeben

        tastatur.close();
    }
}