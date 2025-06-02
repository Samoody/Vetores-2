// Nome: Samuel Kleber Vieira
// RA: 12123150
// Data: 02/06/2025

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = new String[5];

        System.out.println("Digite 5 palavras:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            vetor[i] = sc.nextLine();
        }

        System.out.print("Digite a palavra que deseja buscar: ");
        String busca = sc.nextLine();

        int contador = contarOcorrencias(vetor, busca);

        System.out.println("A palavra \"" + busca + "\" aparece " + contador + " vezes no vetor.");

        sc.close();
    }

    // Função que conta quantas vezes a palavra 'busca' aparece no vetor
    public static int contarOcorrencias(String[] vetor, String busca) {
        int contador = 0;
        for (String palavra : vetor) {
            if (palavra.equalsIgnoreCase(busca)) {
                contador++;
            }
        }
        return contador;
    }
}
