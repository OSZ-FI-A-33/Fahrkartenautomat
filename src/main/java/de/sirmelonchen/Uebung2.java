import java.util.Scanner;

public class Uebung2 {

    public static void main(String[] args) {
        // Eingabe der beiden Zahlen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe von Zahl1: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Eingabe von Zahl2: ");
        int zahl2 = scanner.nextInt();

        // Ausgabe der ungeraden Zahlen zwischen den beiden Zahlen
        System.out.println("Ungerade Zahlen zwischen " + zahl1 + " und " + zahl2 + ":");

        // Stelle sicher, dass zahl1 kleiner ist als zahl2
        if (zahl1 > zahl2) {
            int temp = zahl1;
            zahl1 = zahl2;
            zahl2 = temp;
        }

        for (int i = zahl1; i <= zahl2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Schließen des Scanners, um Ressourcen freizugeben
        scanner.close();
    }
}

