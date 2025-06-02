// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um array de 5 elementos inteiros
        int[] vetor = new int[5];

        // Solicita a entrada dos 5 números pelo usuário
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Pede um número para procurar no vetor
        System.out.print("Digite um número para buscar no vetor: ");
        int busca = sc.nextInt();

        // Variáveis para armazenar se achou e a posição
        boolean encontrado = false;
        int posicao = -1;

        // Percorre o vetor para procurar o número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                encontrado = true;
                posicao = i;  // guarda a posição onde achou
                break;        // para a busca assim que achar
            }
        }

        // Mostra resultado para o usuário
        if (encontrado) {
            System.out.println("Número " + busca + " encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Número " + busca + " não encontrado no vetor.");
        }

        sc.close();
    }
}
