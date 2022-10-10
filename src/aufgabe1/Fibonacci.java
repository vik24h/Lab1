package aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int nthFibNumber(int n) {
        int f1 = 1, f2 = 1, f3 = -1;
        if (n <= 2) return 1;
        n -= 2;
        while (n > 0) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f3;
    }

    public static boolean isFib(int n) {
        int root1, root2, n1 = (int) (5 * Math.pow(n, 2) + 4), n2 = (int) (5 * Math.pow(n, 2) - 4);
        root1 = (int) Math.sqrt(n1);
        root2 = (int) Math.sqrt(n2);
        return (root1 * root1 == n1) || (root2 * root2 == n2);
    }

    public static List<Integer> firstNElems(int n) {
        int f1 = 1, f2 = 1, f3 = -1;
        List<Integer> list = new ArrayList<Integer>();
        if (n >= 1) {
            list.add(0, 1);
            if (n == 1) return list;
        }
        if (n >= 2) {
            list.add(1, 1);
            if (n == 2) return list;
        }
        int x = 2;
        n -= 2;
        while (n > 0) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
            list.add(x, f3);
            x++;
        }
        return list;

    }


}