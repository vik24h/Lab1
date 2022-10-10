package aufgabe1;

import java.util.Arrays;

public class Wetterstation {
    //private - wir wollen nicht, dass wir Zugriff auf Klassenmember von ausserhalb der Klasse haben
    //final - der Wert des Members bleibt unverandert; schreiben wir mit grosse Buchstaben

    //statisches Member -> dieser Wert ist gleich in allen Instanzen der Klasse
    private static final int[] TEMPERATUREN =
            new int[]{12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};

    //man kann in eine non-statische Methode ein statisches Member nicht benutzen
    public static double durchschnitt() {
        double sum = 0;
        for (int j : TEMPERATUREN) {
            sum += j;
        }
        return sum / TEMPERATUREN.length;
    }

    public int maxTemperatur() {
        int max = TEMPERATUREN[0];
        for (int i = 1; i < TEMPERATUREN.length; i++) {
            if (TEMPERATUREN[i] > max) {
                max = TEMPERATUREN[i];
            }
        }
        return max;
    }

    public int minTemperatur() {
        int min = TEMPERATUREN[0];
        for (int i = 1; i < TEMPERATUREN.length; i++) {
            if (TEMPERATUREN[i] < min) {
                min = TEMPERATUREN[i];
            }
        }
        return min;
    }

    public static int maxTempSchwung() {
        int day = 0;
        int maxDiff = 0;
        for (int i = 0; i < TEMPERATUREN.length - 1; i++) {
            int currDiff = Math.abs(TEMPERATUREN[i] - TEMPERATUREN[i + 1]);
            if (currDiff > maxDiff) {
                maxDiff = currDiff;
                day = i;
            }
        }
        return day;//print day and next day
    }
}

