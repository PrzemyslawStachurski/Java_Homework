package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykaldPrzeciazenie Przyklad1 = new PrzykaldPrzeciazenie();
        Przyklad1.Wypisz(10);
        Przyklad1.Wypisz(19.2);
        Przyklad1.Wypisz("przeciazenie argument ");
    }
}

class PrzykaldPrzeciazenie {
    public void Wypisz(int x) {
        System.out.println("int = " + x);
    }

    public void Wypisz(double x) {
        System.out.println("double = " + x);
    }

    public void Wypisz(String x) {
        System.out.println("String = " + x);
    }
}
