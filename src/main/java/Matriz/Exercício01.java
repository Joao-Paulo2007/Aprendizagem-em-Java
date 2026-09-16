package Matriz;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("M[" + (i + 1) + "][" + (j + 1) + "] =");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz formada");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\nTrocando linha 1 pela 3");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {

                if (i == 0) {
                    int temp = matriz[0][j];
                    matriz[0][j] = matriz[2][j];
                    matriz[2][j] = temp;
                }
                System.out.print(matriz[i][j] + " ");

            }
        }
        sc.close();
    }
}