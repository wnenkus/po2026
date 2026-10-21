package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Lotto_zad_2 {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<Integer>();
        for(String arg : args) {
            typy.add(Integer.parseInt(arg));

        }
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int licznik = 0 ;
        Random losowa = new Random();
        while(lista.size() < 6) {
            int llosowa=losowa.nextInt(49)+1;
            if(!lista.contains(llosowa))
                lista.add(llosowa);
            if(typy.contains(llosowa))
                licznik+=1;

        }
        System.out.println(lista);
        System.out.println(licznik);
    }
}




