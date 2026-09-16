package Matriz;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Matriz 1");
        int[][] m1 = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("M1["+(i+1)+ "]["+(j+1)+ "] =");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz 2");
        int[][] m2 = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("M2["+(i+1)+ "]["+(j+1)+ "] =");
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("\nImprimindo a Matriz 1");
        for(int i = 0; i < 2; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print(m1[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("\nImprimindo a Matriz 2");
        for(int i = 0; i < 2; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print(m2[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("\nSomando as matrizes");
        for(int i = 0; i < 2; i++){
            System.out.println("");
            for(int j = 0; j < 2; j++){
                int soma = m1[i][j] + m2[i][j];
                System.out.print(soma + " ");
            }
        }
        sc.close();
    }
}