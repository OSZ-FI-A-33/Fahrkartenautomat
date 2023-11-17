package de.sirmelonchen;

import javax.swing.*;
import java.awt.desktop.SystemEventListener;

public class A11_Uebung {
    public static void main(String[] args) {
        int cent;
        cent =70;
        System.out.println("Cent ist: " + cent);
        cent = 80;
        System.out.println("Cent ist: " + cent);


        double maximum;
        maximum = 95.50;
        System.out.println("Maximum ist: " + maximum);

        boolean one = true;
        int two = -1000;
        float three = 1.255F;
        char four = '#';
        byte five = 8;
        long six = 2147483648L;
        System.out.println("Wert 1: " + one);
        System.out.println("Wert 2: " + two);
        System.out.println("Wert 3: " + three);
        System.out.println("Wert 4: " + four);
        System.out.println("Wert 5: " + five);
        System.out.println("Wert 6: " + six);


        String SatzmitdreiWorten = "Ich mag züge";
        final short check_nr = 8765;

        System.out.println("Mein satz ist: " + SatzmitdreiWorten);
        System.out.println("Die Check Nummer ist: " + check_nr);

/*
Jeder Datentyp hat seine eigenen features um sie weiterzuverarbeiten. Ein String kann nicht addiert werden z.B.
Die Datentypen verwenden auch alle verschieden viel Arbeitsspeicher.
 */


        int ergebns = 4+(8*9)-1;
        System.out.println("Ergebnis: " + ergebns);

        int zaehler = 1;
        zaehler++;
        System.out.println("Zaehler: " + zaehler);


        /*
        false && false >> false
        false && true >> false
        true && false >> false
        true && true >> true


        false && false >> false
        false && true >> true
        true && false >> true
        true && true >> true
         */



        byte schalter = 10;
        boolean logik = schalter > 7 && schalter < 12;
        System.out.println(logik);
        boolean logik2 = schalter != 10;
        System.out.println("Schalter nicht gleich 10?: " + logik2);
        boolean logik3 = schalter == 12;
        System.out.println("Schalter gleich dem Wert 12?: " + logik3);


        String zeichenkette = "Meine Oma " + "fährt im " + "Hühnerstall Motorrad.";
        System.out.println(zeichenkette);


    }
}
