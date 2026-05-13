Pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int[] A = new int[5];
    int[] B = new int[5];

    // Ler os elementos do vetor A
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um valor para A[" + i + "]: ");
      A[i] = leia.nextInt();
    }

    // Multiplicar os elementos de A por 3 e armazenar em B
    for (int i = 0; i < 5; i++) {
      B[i] = A[i] * 3;
    }

    // Mostrar os elementos do vetor B
    System.out.println("\nElementos do vetor B:");

    for (int i = 0; i < 5; i++) {
      System.out.println("B[" + i + "] = " + B[i]);
    }
  }
}
