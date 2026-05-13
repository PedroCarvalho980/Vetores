Pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int[] vetor = new int[10];

    // Leitura dos valores
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um valor: ");
      vetor[i] = leia.nextInt();
    }

    // (a) Imprimir números pares
    System.out.println("\nElementos pares:");

    for (int i = 0; i < 10; i++) {
      if (vetor[i] % 2 == 0) {
        System.out.println(vetor[i]);
      }
    }

    // (b) Imprimir números ímpares
    System.out.println("\nElementos ímpares:");

    for (int i = 0; i < 10; i++) {
      if (vetor[i] % 2 != 0) {
        System.out.println(vetor[i]);
      }
    }
  }
}
