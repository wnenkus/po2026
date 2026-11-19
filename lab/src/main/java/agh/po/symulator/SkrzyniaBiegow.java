package agh.po.symulator;
public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent, String model, int iloscBiegow, Sprzeglo sprzeglo) {
        super(producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        aktualnyBieg = 0;
    }

    public void zwiekszBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
        }
    }

    public void zerujBieg() {
        aktualnyBieg = 0;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}

