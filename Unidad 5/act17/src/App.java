import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int numero, acumulador;

    System.out.print("Introduce un número: ");
    numero = s.nextInt();

    if (numero < 0) {
      do {
        System.out.print("Introduce un número: ");
        numero = s.nextInt();
      } while (numero < 0);
    } else {
      for (acumulador = 1; acumulador <= 100; acumulador++) {
        numero += acumulador;
      }
      System.out.print(numero);
    }

    s.close();
  }
}
