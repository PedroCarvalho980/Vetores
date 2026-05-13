Pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int[] A = new int[5];
    int[] B = new int[5];
    int[] C = new int[5];

    // Ler os valores do vetor A
    System.out.println("Digite os valores do vetor A:");

    for (int i = 0; i < 5; i++) {
      System.out.print("A[" + i + "]: ");
      A[i] = leia.nextInt();
    }

    // Ler os valores do vetor B
    System.out.println("\nDigite os valores do vetor B:");

    for (int i = 0; i < 5; i++) {
      System.out.print("B[" + i + "]: ");
      B[i] = leia.nextInt();
    }

    // Subtração dos vetores
    for (int i = 0; i < 5; i++) {
      C[i] = A[i] - B[i];
    }

    // Mostrar vetor C
    System.out.println("\nElementos do vetor C:");

    for (int i = 0; i < 5; i++) {
      System.out.println("C[" + i + "] = " + C[i]);
    }
  }
}
