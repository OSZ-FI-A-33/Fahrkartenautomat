package de.sirmelonchen;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class A521_Addieren {
    public static void main(String[] args) {
        Scanner taste = new Scanner(System.in);
        int n;
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        n = taste.nextInt();
        System.out.println("Die zahlen werden addiert: ");
        hochzählen(n);
        System.out.println("Die zahlen werden subtrahiert: ");
        runterzählen(n);

    }
    public static void hochzählen(int n){
        int summe = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i + "");
            summe += i;
        }
        System.out.println("Die Summe beträgt: " + summe);
    }
    public static void runterzählen(int n){
        int summe = 0;
        for(int i = n; i >= 1; i--){
            System.out.println(i + "");
            summe += i;
        }
        System.out.println("Die Summe beträgt: " + summe);
    }
}
