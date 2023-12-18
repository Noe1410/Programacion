import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int exponente, base, contadorPotencia = 1, exp = 1;

    System.out.print(
      "Introduce una base y un exponente separados por un espacio: "
    );
    base = s.nextInt();
    exponente = s.nextInt();

    while (exp <= exponente) {
      contadorPotencia *= base;
      System.out.println(base + "^" + exp + " = " + contadorPotencia);
      exp++;
    }

    s.close();
  }
}
