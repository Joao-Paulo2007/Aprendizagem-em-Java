package Matriz;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] matriz = new int[3][3];
        System.out.println("Criando a Matriz");
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.println("M1["+(i+1)+ "]["+(j+1)+ "] =");
            matriz[i][j] = sc.nextInt();
        }
    }

    System.out.println("\nBuscando valor dentro da matriz");
        System.out.print("Valor procurado: ");
        int vb = sc.nextInt();
        boolean encontrado = false;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                if(vb == matriz[i][j]) {
                    System.out.println("O valor procurado está presente na matriz");
                    System.out.println(vb + " está na posição [" + (i + 1) + "][" + (j + 1) + "]");
                encontrado = true;
                }
                }
            }
        if(!encontrado) {
            System.out.println("O valor digitado não se encontra dentro desta matriz");
        }
        sc.close();
    }
}