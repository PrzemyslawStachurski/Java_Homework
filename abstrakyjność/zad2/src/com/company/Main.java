package com.company;

public class Main {

    static void rysujUtil(int x1,int x2, int y1, int y2, Grafika g){
        g.setPoczatek(x1 ,y1);
        g.setKoniec(x2,y2);
        g.rysuj();
    }

    public static void main(String[] args) {
        rysujUtil(30,30,40,40,new Linia());
        rysujUtil(50,50,60,60,new Prostokat());
    }

}

abstract class Grafika {
    protected int x1, x2, y1, y2;

    public void setPoczatek(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setKoniec(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }
    abstract void rysuj();
}

class Linia extends Grafika{
    public void rysuj(){
        System.out.printf("rysuj linię od (%d, %d) do (%d, %d) %n",x1,x2,y1,y2);
    }
}
class Prostokat extends Grafika{
    public void rysuj(){
        System.out.printf("rysuj prostokat od (%d, %d) do (%d, %d) %n",x1,x2,y1,y2);
    }
}