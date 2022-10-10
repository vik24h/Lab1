package aufgabe1;

public class MatheAufgabe {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static boolean istPerfekt(int n) {
        int summe = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                summe += i;
            }
        }
        return summe == n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n%2==0) return false;
        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

}
