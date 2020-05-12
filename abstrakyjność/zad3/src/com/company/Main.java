package com.company;

public class Main {

    public static void main(String[] args) {
        MojKalkulator mojKalkulator =new MojKalkulator();

        System.out.println(mojKalkulator.dodaj(10,20));
        System.out.println(mojKalkulator.odejmij(10,20));
        System.out.println(mojKalkulator.sinus(90));

        Kalkulator nowyKalkulator = new MojKalkulator();

        System.out.println(nowyKalkulator.dodaj(10,20));
        System.out.println(nowyKalkulator.odejmij(10,20));
    }
}

interface Kalkulator {
    double PI = 3.14159;

    double dodaj(double x, double y);

    double odejmij(double x, double y);
}

class MojKalkulator implements Kalkulator {
    public double dodaj(double x, double y) {
        return x + y;
    }

    public double odejmij(double x, double y) {
        return x - y;
    }

    public double sinus(double x) {
        double y = x * 3.41459 / 180;
        return Math.sin(y);
    }
}