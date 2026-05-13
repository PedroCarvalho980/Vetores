import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    String[] nomes = new String[5];

    // Leitura dos nomes
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um nome: ");
      nomes[i] = leia.nextLine();
    }

    // (a) Imprimir do último para o primeiro
    System.out.println("\nNomes do último para o primeiro:");

    for (int i = 4; i >= 0; i--) {
      System.out.println(nomes[i]);
    }

    // (b) Imprimir primeiro e último nome
    System.out.println("\nPrimeiro nome: " + nomes[0]);
    System.out.println("Último nome: " + nomes[4]);
  }
}