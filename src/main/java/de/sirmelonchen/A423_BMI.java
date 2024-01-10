package de.sirmelonchen;

import java.util.Scanner;
public class A423_BMI {
    public static void main(String[] args) {
        double groesse;
        double gewicht;
        double bmi;
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre Größe in m an:");
        groesse = eingabe.nextDouble();

        System.out.println("Geben Sie nun noch Ihr Gewicht in Kilogramm an:");
        gewicht = eingabe.nextDouble();

        bmi = gewicht / (groesse * groesse);

        System.out.println("Berechne...");
        System.out.println("Sie haben einen BMI von" + bmi + ".");
    }
}