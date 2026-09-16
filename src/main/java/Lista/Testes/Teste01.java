package Lista.Testes;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste01 {
    public static void main (String[]args){

    ArrayList<String> lista = new ArrayList<>();
    lista.add("Recruta");
    System.out.println(lista);

    ArrayList<Integer> ln = new ArrayList<>(Arrays.asList(45,55,76,89,90));
    System.out.println(ln);

    //Object permite todos os tipos dentro da lista
    ArrayList<Object> lmista = new ArrayList<>();
    lmista.add(10);
    lmista.add("Olá Mundo");
    lmista.add(2.5);
    lmista.add(new ArrayList<>(Arrays.asList("a","b", 25, 45)));
    lmista.add(true);
        System.out.println(lmista);


    ArrayList<String> lf = new ArrayList<>(Arrays.asList("Maça", "Morango", "Melancia", "Laranja"));
        //Buscando o item da posição 3
        System.out.println("Fruta dentro da lista: " + lf.get(3));
        //Buscando o item da posição 1
        System.out.println("Fruta dentro da lista: " + lf.get(1));

        int tamanho = lf.size();

        //tamanho - 1: O tamanho não considera o valor 0.
        System.out.println("\n Última fruta da lista: " + lf.get(tamanho - 1));

    }
}