package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ksztalt> ksztalty = new ArrayList<>();

        ksztalty.add(new Kwadrat(5));
        ksztalty.add(new Kolo(5));

        for (Ksztalt x : ksztalty){
            System.out.println("powierzchnia kształtu to: "+ x.obliczPowierzchnie());
        }
    }
}

interface Ksztalt {

    double obliczPowierzchnie();

    double obliczObwod();
}

class Kwadrat implements Ksztalt {
    double dlugoscBoku;

    Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku * 4;
    }
}

class Kolo implements Ksztalt {
    double promien;

    Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnie() {
        return promien * promien * Math.PI;
    }

    @Override
    public double obliczObwod() {
        return Math.PI * 2 * promien;
    }
}