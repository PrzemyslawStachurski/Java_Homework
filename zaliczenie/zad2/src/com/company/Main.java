package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList ParkMaszynowy = new ArrayList();

        Kosiarka pierwszaKosiarka = new Kosiarka("VIKING", "kosiarka1", 30,
                "elektryczny", false, false, 4);
        ParkMaszynowy.add(pierwszaKosiarka);
        pierwszaKosiarka.setLiczbaOstrzy(6);
        pierwszaKosiarka.wyswietl();

        Kosiarka drugaKosiarka = new Kosiarka("NAC", "kosiarka2", 50,
                "spalinowy", true, true, 8);
        ParkMaszynowy.add(drugaKosiarka);
        drugaKosiarka.setCzyMelekser(false);
        drugaKosiarka.wyswietl();

        Lokomotywa pierwszaLokomotywa = new Lokomotywa("Lokpol", "lokomtywa1", 400,
                "parowy", false, 12);
        ParkMaszynowy.add(pierwszaLokomotywa);
        pierwszaLokomotywa.wyswietl();

        Lokomotywa drugaLokomotywa = new Lokomotywa("Ruslok", "lokomotywa2", 800,
                "elektryczny", true, 20);
        ParkMaszynowy.add(drugaLokomotywa);
        drugaLokomotywa.wyswietl();

        Pojazd pierwszyPojazd = new Pojazd("Toyota", "pojazd1", 1500, "benzynowy",
                75, 110, 1, 30);
        ParkMaszynowy.add(pierwszyPojazd);
        pierwszyPojazd.wypisz();

        Pojazd drugiPojazd = new Pojazd("Opel", "pojazd2", 1500, "elektryczny",
                100, 140, 2, 30);
        ParkMaszynowy.add(drugiPojazd);
        drugiPojazd.wypisz();

        Samochod pierwszySamochod = new Samochod("Volvo", "samochód1", 1800,
                "benzynowy", 160, 150, 3, 40,
                "V40", "A123CB");
        ParkMaszynowy.add(pierwszySamochod);
        pierwszySamochod.wypisz();

        Samochod drugiSamochod = new Samochod("Audi", "samochód2", 1700, "benzynowy"
                , 120, 130, 4, 30, "A4", "12C123F");
        ParkMaszynowy.add(drugiSamochod);
        drugiSamochod.wypisz();

        Jednoslad pierwszyJednoslad = new Jednoslad("Honda", "jednoslad1", 500,
                "benzynowy", 70, 80, 5, 20, "motocykl");
        ParkMaszynowy.add(pierwszyJednoslad);
        pierwszyJednoslad.wypisz();

        Jednoslad drugiJednoslad = new Jednoslad("Kawasaki", "jednoslad2", 40,
                "benzynowy", 60, 70, 6, 30, "motocykl");
        ParkMaszynowy.add(drugiJednoslad);
        drugiJednoslad.wypisz();
    }
}

abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected int pojemnoscSilnika;
    protected String rodzajSilnika;
}

class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    Kosiarka(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
             boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyNaped = czyNaped;
        this.czyMelekser = czyMelekser;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Marka kosiarki: " + marka);
        System.out.println("Nazwa kosiarki: " + nazwa);
        System.out.println("Pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Czy kosiarka jest melekserem: " + czyMelekser);
        System.out.println("Czy kosiarka posiada napęd: " + czyNaped);
        System.out.println("Ile kosiarka posiada ostrzy: " + liczbaOstrzy + "\n");
    }
}

class Lokomotywa extends Maszyna {
    private boolean czyRadziecka;
    private int maxLiczbaWagonow;

    Lokomotywa(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
               boolean czyRadziecka, int maxLiczbaWagonow) {
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyRadziecka = czyRadziecka;
        this.maxLiczbaWagonow = maxLiczbaWagonow;
    }

    public void wyswietl() {
        System.out.println("Marka lokomotywy: " + marka);
        System.out.println("Nazwa lokomotywy: " + nazwa);
        System.out.println("Pojemość silnika: " + pojemnoscSilnika);
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Czy lokomotywa jest radziecka?: " + czyRadziecka);
        System.out.println("Maksymalna liczba wagonów: " + maxLiczbaWagonow + "\n");
    }
}

class Pojazd extends Maszyna {
    protected static int maxLiczbaPojazdow;
    protected int moc;
    protected int momentObrotowy;
    protected int nrPojazdu;

    Pojazd(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
           int moc, int momentObrotowy, int nrPojazdu, int maxLiczbaPojazdow) {
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.maxLiczbaPojazdow = maxLiczbaPojazdow;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.nrPojazdu = nrPojazdu;
    }

    public void wypisz() {
        System.out.println("Marka pojazdu: " + marka);
        System.out.println("Nazwa pojazdu: " + nazwa);
        System.out.println("Pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Moc pojazdu " + moc);
        System.out.println("Moment obrotowy pojazdu: " + momentObrotowy);
        System.out.println("Numer pojazdu: " + nrPojazdu + "\n");
    }
}

class Samochod extends Pojazd {
    private String model;
    private String VIN;

    Samochod(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
             int moc, int momentObrotowy, int nrPojazdu, int maxLiczbaPojazdow,
             String model, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy, nrPojazdu, maxLiczbaPojazdow);
        this.model = model;
        this.VIN = VIN;
    }

    @Override
    public void wypisz() {
        super.wypisz();
        System.out.println("Model samochodu to: " + model);
        System.out.println("Numer VIN to: " + VIN + "\n");
    }
}

class Jednoslad extends Pojazd {
    private String typ;

    Jednoslad(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
              int moc, int momentObrotowy, int nrPojazdu, int maxLiczbaPojazdow,
              String typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy, nrPojazdu, maxLiczbaPojazdow);
        this.typ = typ;
    }

    @Override
    public void wypisz() {
        super.wypisz();
        System.out.println("Typ jednośladu: " + typ + "\n");
    }
}