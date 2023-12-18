import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println(
      "Introduzca la base y la altura de su rectangulo separados por un espacio."
    );

    double base = s.nextDouble();
    double altura = s.nextDouble();
    double i = 1;

    s.close();

    System.out.println("");

    for (i = 1; i <= altura; i++) {
      for (double u = 1; u <= base; u++) {
        if (altura == i | altura == base | base == u | 1 == u | 1 == i) {
          System.out.printf("* ");
        } else {
          System.out.printf("  ");
        }
      }
      System.out.println("");
    }
    System.out.println("");

    System.out.println("El area del rectángulo es: " + base * altura);
  }
}
