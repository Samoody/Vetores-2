
// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Scanner;

public class Exercicio4 {
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

        int esq = 0;
        int dir = 19;

        for (int i = 0; i < 20; i++) {
            double produto = vetor1[i] * vetor2[19 - i];

            if (i % 2 == 0) {
                resultado[esq] = produto;
                esq++;
            } else {
                resultado[dir] = produto;
                dir--;
            }
        }

        System.out.println("Vetor resultado (das bordas para o centro):");
        for (double v : resultado) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
