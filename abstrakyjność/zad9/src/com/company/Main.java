package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 20, 10};
        int ele = 30;

        Wyszukiwanie W1 = new Wyszukiwanie();

        int index = W1.szukaj(a, ele, new SprawdzenieRownych());

        if (index == -1) {
            System.out.println("nie znaleziono");
        } else {
            System.out.println("znaleziono w indeksie numer: " + index);
        }
    }
}

interface Sprawdzanie {
    boolean porownaj(int a, int b);
}

class Wyszukiwanie {
    public int szukaj(int a[], int ele, Sprawdzanie sprawdzanie) {
        for (int i = 0; i < a.length; i++) {
            if (sprawdzanie.porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class SprawdzenieRownych extends Wyszukiwanie implements Sprawdzanie {
    public boolean porownaj(int a, int b) {
        return a == b;
    }
}