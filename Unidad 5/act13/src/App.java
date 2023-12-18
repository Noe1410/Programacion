import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int numeros = 0;
    int negativo = 0;
    int positivo = 0;

    System.out.print("Introduce diez números. ");

    do {
      int numero = s.nextInt();
      if (numero >= 0) {
        positivo++;
      } else {
        negativo++;
      }
      numeros++;
    } while (numeros < 10);
    System.out.println("");
    System.out.println("Has introducido " + positivo + " números positivos.");
    System.out.println("Has introducido " + negativo + " números negativos.");

    s.close();
  }
}
