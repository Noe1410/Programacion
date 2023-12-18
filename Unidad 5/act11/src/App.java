import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un numero: ");
    int numero = s.nextInt();
    int i = 1;

    do {
      int cuadrado = (int) Math.pow(numero, 2);
      double cubo = Math.pow(numero, 3);
      System.out.println("");
      System.out.printf("%5d %5d %5.0f\n", numero, cuadrado, cubo);
      numero++;
      i++;
    } while (i <= 5);

    s.close();
  }
}
