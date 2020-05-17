package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladowaKlasa PK1 = new PrzykladowaKlasa();

        PK1.innaMetoda();
        PK1.przykladowaMetoda();
    }
}

interface PrzykladowyInterfejs {

    void przykladowaMetoda();
}

interface InnyInterfejs {

    void innaMetoda();
}

class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs {

    public void przykladowaMetoda() {
        System.out.println("implementacja przykladowejMetody ");
    }

    public void innaMetoda() {
        System.out.println("implementacja innejMetody");
    }
}