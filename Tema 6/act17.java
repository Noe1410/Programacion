import java.util.Scanner;

public class act17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print(
      "Por favor, introduzca la altura de la pecera (como mínimo 4): "
    );
    int altura = s.nextInt();
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura = s.nextInt();

    for (int i = 1; i <= altura; i++) {
      for (int u = 1; u <= anchura; u++) {
        if (altura == i || u == 1 ||  u == anchura) {
          System.out.print("* ");
        }
      }
      System.out.println(" ");
    }
    s.close();
  }
}
