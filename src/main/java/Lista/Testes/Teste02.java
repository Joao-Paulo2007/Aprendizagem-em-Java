package Lista.Testes;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste02 {
    public static void main(String[] args) {
        System.out.println("\n=============PARTE 2=============");

        System.out.println("===Alterando lista===");

        ArrayList<String> listaf = new ArrayList<>(Arrays.asList("Maça", "Laranja", "Morango"));
        //Adiciona no final da lista
        listaf.add("Damasco");
        //Adiciona na posição desejada
        listaf.add(1, "Abacate");
        System.out.println(listaf);

        System.out.println("\n===Removendo item===");
        //Posição do item que deseja remover
        listaf.remove(2);
        System.out.println(listaf);
        //Precisa estar da mesma forma que escreve ou tenta TryCatch
        listaf.remove("Abacate");
        System.out.println(listaf);
        //Remove o Último item da lista
        //Precisa do -1, por que .size() ignora o 0 (ínicio da lista), o começo da conta é 1 (Se houver algo na lista)
        listaf.remove(listaf.size() - 1);
        System.out.println(listaf);

        System.out.println("\n===Unindo Listas===");
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));

        System.out.println("\nLista1: " + l1);
        System.out.println("\nLista2: " + l2);

        ArrayList<Integer> uniao = new ArrayList<>(l1);
        //.addAll adiciona tudo o que estiver dentro de outra lista, porém deve ser do mesmo tipo
        uniao.addAll(l2);

        System.out.println("\nUnião das listas: " + uniao);

        l1.addAll(l2);
        System.out.println(l1);

        System.out.println("\n===Repetindo a lista===");

        ArrayList<Integer> repeticao = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            repeticao.add(1);
            repeticao.add(2);
        }

        System.out.println(repeticao);

        System.out.println("\n===Verificar se o item está na lista===");

        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Morango", "Abacate"));

        //.contains verifica se o item desejado está dentro da lista
        System.out.println("Tem a fruta Morango? " + frutas.contains("Morango"));

        System.out.println("Tem a fruta Laranja? " + frutas.contains("Laranja"));


    }
}