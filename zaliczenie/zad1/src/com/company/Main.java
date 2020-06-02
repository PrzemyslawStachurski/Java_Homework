package com.company;

public class Main {

    public static void main(String[] args) {
        Lew Mufasa = new Lew("Simba",12,110.5,false);
        Orzel Bielik = new Orzel("Bartek",4,18.5,false);

        Bielik.lec();
        Bielik.wypisz();

        Mufasa.biegnij();
        Mufasa.wypisz();
    }
}

class Zwierze {
    String nazwa;
    int wiek;
    double waga;

    Zwierze(String nazwa, int wiek, double waga) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.waga = waga;
    }
}

class Lew extends Zwierze {
    boolean biegnie;

    Lew(String nazwa, int wiek, double waga, boolean biegnie) {
        super(nazwa, wiek, waga);
        this.biegnie = biegnie;
    }

    public void biegnij() {
        this.biegnie = true;
    }

    public void zatrzymajSie() {
        this.biegnie = false;
    }

    void wypisz() {
        if (biegnie) {
            System.out.println("Zwierze biegnie");
        } else if (!biegnie) {
            System.out.println("Zwierze nie biegnie");
        }
    }
}

class Orzel extends Zwierze {
    boolean leci;

    Orzel(String nazwa, int wiek, double waga, boolean leci) {
        super(nazwa, wiek, waga);
        this.leci = leci;
    }

    void lec() {
        this.leci = true;
    }

    void wyladuj() {
        this.leci = false;
    }

    void wypisz() {
        if (leci) {
            System.out.println("Zwierze leci");
        } else if (!leci) {
            System.out.println("Zwierze wylądowało");
        }
    }
}