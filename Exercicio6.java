Pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    // Definição dos tamanhos conforme a imagem Captura de tela 2026-05-12 211912.png
    int[] vetorA = new int[4];
    int[] vetorB = new int[6];
    int[] vetorC = new int[vetorA.length + vetorB.length]; // Tamanho 10

    // Leitura do Vetor A
    System.out.println("Digite os 4 elementos do Vetor A:");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = leitor.nextInt();
    }

    // Leitura do Vetor B
    System.out.println("Digite os 6 elementos do Vetor B:");
    for (int i = 0; i < vetorB.length; i++) {
      vetorB[i] = leitor.nextInt();
    }

    // Processo de Junção
    // 1. Copia elementos de A para C
    for (int i = 0; i < vetorA.length; i++) {
      vetorC[i] = vetorA[i];
    }

    // 2. Copia elementos de B para C (após os elementos de A)
    for (int i = 0; i < vetorB.length; i++) {
      vetorC[vetorA.length + i] = vetorB[i];
    }

    // Exibição do Vetor C
    System.out.print("Vetor C (Junção): ");
    for (int elemento : vetorC) {
      System.out.print(elemento + " ");
    }

    leitor.close();
  }
}
