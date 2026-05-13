import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int[] numeros = new int[10];

    // Ler os números
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um número inteiro: ");
      numeros[i] = leia.nextInt();
    }

    // Imprimir os números lidos
    System.out.println("\nNúmeros digitados:");

    for (int i = 0; i < 10; i++) {
      System.out.println(numeros[i]);
    }

    leia.close();
  }
}