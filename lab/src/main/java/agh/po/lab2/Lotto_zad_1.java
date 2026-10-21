package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto_zad_1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random losowa = new Random();
        while(lista.size() < 6) {
            int llosowa=losowa.nextInt(49)+1;
            if(!lista.contains(llosowa))
                lista.add(llosowa);
        }
        System.out.println(lista);
        }
    }


