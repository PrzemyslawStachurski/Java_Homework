package com.company;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        kalkulatorPodstawowy.dodaj(10, 20);
        kalkulatorPodstawowy.odejmij(20, 30);

        System.out.println();

        KalkulatorStatyczny kalkulatorStatyczny = new KalkulatorStatyczny();
        kalkulatorStatyczny.dodaj(10, 20);
        kalkulatorStatyczny.odejmij(20, 30);
        kalkulatorStatyczny.sin(21.37);
    }
}

class Kalkulator {
    public void dodaj(int a, int b) {
        System.out.println(a + b);
    }

    public void odejmij(int a, int b) {
        System.out.println(a - b);
    }
}

class KalkulatorStatyczny extends Kalkulator {
    public void sin(double a) {
        System.out.println(Math.sin(a));
    }
}