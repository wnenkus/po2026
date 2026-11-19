package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void aktualizujPozycje(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public String getPozycja() {
        return "x = " + x + ", y = " + y;
    }
}

