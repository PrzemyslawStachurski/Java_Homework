package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        p1.wypisz();

        System.out.println();

        Punkt2D p2 = new Punkt2D(10, 20);
        p2.wypisz();

        System.out.println();

        Punkt3D p3 = new Punkt3D();
        p3.wypisz();

        System.out.println();

        Punkt3D p4 = new Punkt3D(10, 20, 30);
        p4.wypisz();
    }
}

class Punkt2D {
    int x, y;

    Punkt2D() {
        x = 0;
        y = 0;
    }

    Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wypisz() {
        System.out.println("wartośc x wynisi: " + x);
        System.out.println("wartość y wynisu: " + y);
    }
}

class Punkt3D extends Punkt2D {
    int z;

    Punkt3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void wypisz() {
        System.out.println("wartosc x wynosi: " + x);
        System.out.println("wartosc y wynosi: " + y);
        System.out.println("wartosc z wynosi: " + z);
    }
}