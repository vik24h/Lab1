package demo;

import aufgabe1.Fibonacci;
import aufgabe1.MatheAufgabe;
import aufgabe1.Wetterstation;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*MatheAufgabe matheAufgabe = new MatheAufgabe();
        double sum = matheAufgabe.add(3.5,4.5);
        double diff = matheAufgabe.sub(3.5,4.5);
        boolean is_perf = matheAufgabe.istPerfekt(23);
        boolean is_prime = matheAufgabe.isPrime(23);

        System.out.println(is_prime);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(is_perf);*/

        //fuer statische Methoden brauchen wir eine Instanz der Klasse nicht
        double sum = MatheAufgabe.add(3.6, 3.8);


        Wetterstation wetterstation = new Wetterstation();
        /*System.out.println(wetterstation.durchschnitt());//weiterhin richtig
        System.out.println(wetterstation.maxTemperatur());
        System.out.println(wetterstation.minTemperatur());*/
        /*int day = Wetterstation.maxTempSchwung();
        System.out.print(day);
        System.out.print(" ");
        System.out.print(day+1);*/

        System.out.println(Fibonacci.nthFibNumber(10));
        System.out.println(Fibonacci.isFib(55));
        System.out.println(Fibonacci.firstNElems(10));
    }
}