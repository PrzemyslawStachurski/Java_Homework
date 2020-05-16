package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 20;
        a[4] = 10;

        WyszukiwanieRownych WR1 = new WyszukiwanieRownych();
        int index = WR1.szukaj(a, 30);
        if (index == -1) {
            System.out.println("nie znaleziono");
        } else {
            System.out.println("znaleziono w indeksie" + index);
        }
    }
}

abstract class Wyszukiwanie {

    public boolean porownaj(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public int szukaj(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class WyszukiwanieRownych extends Wyszukiwanie {

    public boolean prownaj(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie {

    public boolean prownaj(int a, int b) {
        if (a != b) {
            return true;
        } else {
            return false;
        }
    }
}