import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println(
      "Introduzca la cantidad de euros que quiera convertir a pesetas."
    );

    int euro = s.nextInt();
    double conversion = euro * 166.386;

    System.out.printf("Un euro son %.3f pesetas. ", (float) conversion);

    s.close();
  }
}
