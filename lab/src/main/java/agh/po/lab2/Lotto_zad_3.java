package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_zad_3 {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<>();
        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }
        if (typy.isEmpty()) {
            for (int i = 1; i <= 6; i++) {
                typy.add(i);
            }
        }

        Random losowa = new Random();
        long start = System.currentTimeMillis();
        long liczbaLosowan = 0;
        int trafienia = 0;

        while (trafienia < 6) {

            ArrayList<Integer> lista = new ArrayList<>();
            while (lista.size() < 6) {
                int liczba = losowa.nextInt(49) + 1;
                if (!lista.contains(liczba)) {
                    lista.add(liczba);
                }
            }
            liczbaLosowan++;


            ArrayList<Integer> wspolne = new ArrayList<>(lista);
            wspolne.retainAll(typy);
            trafienia = wspolne.size();
        }

        long czas = System.currentTimeMillis() - start;
        System.out.println("Twoje typy: " + typy);
        System.out.println("Liczba losowań do trafienia 6/6: " + liczbaLosowan);
        System.out.println("Czas działania: " + czas + " ms");
    }
}