package de.sirmelonchen;

public class A431_Fahrplan {
    public static void main(String[] args) {
        // Weichenstellungen. Passen Sie gerne die Werte zum Testen an.
        int fahrzeit = 0;
        boolean haltInSpandau = false;
        boolean richtungHamburg = false;
        boolean haltInStendal = true;
        char endetIn = 'h'; //h=Hannover, b=Braunschweig, w=Wolfsburg

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == true) {
            fahrzeit = fahrzeit + 2; // Halt in Spandau,

            if (richtungHamburg == true) {
                fahrzeit = fahrzeit + 96; // Fahrzeit Spandau -> Hamburg
            }

            if (haltInStendal == true) {
                fahrzeit = fahrzeit + 50; //Fahrt zur westlichen Weiche nach Stendal
            }
        }

    }
}

