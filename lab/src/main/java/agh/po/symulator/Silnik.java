package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        obroty = 0;
    }

    public void uruchom() {
        obroty = 800;
    }

    public void zatrzymaj() {
        obroty = 0;
    }

    public int getObroty() {
        return obroty;
    }
}

