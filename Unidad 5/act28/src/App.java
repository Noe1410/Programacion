import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num = s.nextInt();
    int acumulador = num;
    int factor = num;
    int factorial = 1;

    do {
      factorial++;
      acumulador -= 1;
      factor*=acumulador;
    } while (factorial < num );
    System.out.println("El factorial de "+num+" es "+factor);

    s.close();
  }
}
