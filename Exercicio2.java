
// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[10];
        double[] precos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Descrição do produto " + (i + 1) + ": ");
            produtos[i] = sc.nextLine();
            System.out.print("Preço do produto " + (i + 1) + ": R$ ");
            precos[i] = sc.nextDouble();
            sc.nextLine(); // Limpa buffer
        }

        System.out.print("Digite o percentual de aumento (ex.: 10 para 10%): ");
        double percentual = sc.nextDouble();

        System.out.println("\nProdutos atualizados:");
        for (int i = 0; i < 10; i++) {
            precos[i] += precos[i] * (percentual / 100);
            System.out.printf("Produto: %s - Novo Preço: R$ %.2f\n", produtos[i], precos[i]);
        }

        sc.close();
    }
}
