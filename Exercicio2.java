Pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int[] vetor = new int[5];
    int maior;

    // Leitura dos números
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um número: ");
      vetor[i] = leia.nextInt();
    }

    // Assume que o primeiro é o maior
    maior = vetor[0];

    // Verifica o maior elemento
    for (int i = 1; i < 5; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }

    // Resultado
    System.out.println("O maior elemento do vetor é: " + maior);
  }
}
