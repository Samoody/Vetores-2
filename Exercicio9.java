// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(21) - 10; // Gera número entre -10 e 10
        }

        System.out.println("Vetor gerado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}