package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_zad_3 {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<>();
        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }

        Random losowa = new Random();
        long start = System.currentTimeMillis();
        long liczbaLosowan = 0;

        ArrayList<Integer> lista = new ArrayList<>();
        do {
            lista.clear();
            while (lista.size() < 6) {
                int liczba = losowa.nextInt(49) + 1;
                if (!lista.contains(liczba)) {
                    lista.add(liczba);
                }
            }
            liczbaLosowan++;
        } while (!lista.containsAll(typy));

        long czas = System.currentTimeMillis() - start;
        System.out.println("typy: " + typy);
        System.out.println("Liczba losowań: " + liczbaLosowan);
        System.out.println("Czas działania: " + czas + " ms");
    }
}