// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] ordenado = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            ordenado[i] = vetor[i];
        }

        Arrays.sort(ordenado);

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(ordenado));

        sc.close();
    }
}