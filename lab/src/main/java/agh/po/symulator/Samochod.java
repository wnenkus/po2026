package agh.po.symulator;
public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja pozycja;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.pozycja = pozycja;
    }

    public void wlacz() {
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public Pozycja getPozycja() {
        return pozycja;
    }
}

