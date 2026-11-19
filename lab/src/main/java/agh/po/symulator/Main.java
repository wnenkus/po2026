package agh.po.symulator;

public class Main {
    public static void main() {
        Sprzeglo sprzeglo = new Sprzeglo("firma","model");
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("firma","model",6,sprzeglo);
        Silnik silnik = new Silnik("firma","model",6000);
        Pozycja pozycja = new Pozycja(0,0);

        Samochod autko = new Samochod(silnik,skrzynia,pozycja);
        autko.wlacz();
        System.out.println("Obroty po starcie:"+silnik.getObroty());
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        System.out.println("Bieg: " + skrzynia.getAktualnyBieg());

        skrzynia.zmniejszBieg();
        System.out.println("Bieg po zmniejszeniu: " + skrzynia.getAktualnyBieg());

        sprzeglo.wcisnij();
        System.out.println("Sprzeglo wcisniete: " + sprzeglo.getStanSprzegla());
        sprzeglo.zwolnij();

        pozycja.aktualizujPozycje(5, 3);
        System.out.println("Pozycja: " + pozycja.getPozycja());

        autko.wylacz();
        System.out.println("Obroty i bieg po wylaczeniu:"+silnik.getObroty()+" "+skrzynia.getAktualnyBieg());

    }
}
