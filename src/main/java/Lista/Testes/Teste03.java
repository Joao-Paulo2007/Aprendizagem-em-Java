package Lista.Testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Teste03 {
    public static void main (String []args){

    ArrayList<Integer> n = new ArrayList<>(Arrays.asList(32,75,67,34,10));

    ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
       "banana",
       "maça",
       "morango",
       "damasco",
       "amora",
       "maça",
       "caju"
    ));

        System.out.println("\n===Lista de Números===");
        System.out.println("\nLista de n° (original): " + n);

        //.sort ele ordena o menor número para o maior.
        Collections.sort(n);

        System.out.println("\nNúmeros ordenados (Crescente): " + n);

        //reverse.Order ele inverte a ordem da lista
        Collections.sort(n, Collections.reverseOrder());

        System.out.println("\nNúmeros ordenados (Decrescente): " + n);

        System.out.println("\n--Invertendo a ordem--");

        //.reverse é responsável por reverter a lista
        Collections.reverse(n);

        System.out.println("Lista de Números após .reverse(): " + n);

        //O código contará quantas vezes o item selecionado aparece dentro da lista números
        System.out.println("\n--Contando Ocorrências--");

        int ocN6 = 0;

        for(int ns: n){
            if(ns == 6) {
                ocN6++;
            }
        }
        System.out.println("Tem "+ ocN6 + " número(s) 6 dentro da lista");


        //Análisa a lista até encontrar a primeira vez que o objeto é encontrado
        System.out.println("\n-- Buscando Índices --");

        //.indexOf é que faz essa busca
        int indice67 = n.indexOf(67);

        if(indice67 != -1){
            System.out.println("índice do número 67: " + indice67);
        }else{
            System.out.println("Não há o número 67 dentro da lista");
        }

        System.out.println("\n===Lista de Frutas===");
        System.out.println("\nLista de frutas (original): " + fruits);

        //.sort ordena em ordem alfabética também
        Collections.sort(fruits);

        System.out.println("\nFrutas ordenadas (A --> Z): " + fruits);

        //.reverse vai inverter a ordem da lista
        Collections.reverse(fruits);

        System.out.println("\nFrutas ordenas (Z --> A): " + fruits);

        //O código contará quantas vezes o item selecionado aparece dentro da lista frutas
        System.out.println("\n--Contando Ocorrências--");

        int ocMaca = 0;

        for(String fruit: fruits){
            if(fruit.equals("maça")) {
                ocMaca++;
            }
        }
        System.out.println("Tem "+ ocMaca + " Maça(as) dentro da lista");

        //Análisa a lista até encontrar a primeira vez que o objeto é encontrado
        System.out.println("\n-- Buscando Índices --");

        //.indexOF é quem faz essa busca
        int indiceMaca = fruits.indexOf("maça");

        if(indiceMaca != -1){
            System.out.println("índice da primeira Maça: " + indiceMaca);
        }else{
            System.out.println("Não há Maça dentro da lista");
        }
    }
}
