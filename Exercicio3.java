
// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor1 = new double[20];
        double[] vetor2 = new double[20];
        double[] resultado = new double[20];

        System.out.println("Digite 20 números reais para o primeiro vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Vetor1 [" + i + "]: ");
            vetor1[i] = sc.nextDouble();
        }

        System.out.println("Digite 20 números reais para o segundo vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Vetor2 [" + i + "]: ");
            vetor2[i] = sc.nextDouble();
        }

        int centro = 9;
        int posicaoEsq = centro;
        int posicaoDir = centro + 1;

        for (int i = 0; i < 20; i++) {
            double produto = vetor1[i] * vetor2[19 - i];

            if (i % 2 == 0) {
                resultado[posicaoEsq] = produto;
                posicaoEsq--;
            } else {
                resultado[posicaoDir] = produto;
                posicaoDir++;
            }
        }

        System.out.println("Vetor resultado (do centro para as bordas):");
        for (double v : resultado) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
