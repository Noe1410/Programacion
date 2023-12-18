import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int hora;

    do {
      System.out.println(
        "Introduzca la hora por favor, solo la hora no los minutos."
      );
      hora = s.nextInt();

      if (hora >= 6 && hora <= 12) {
        System.out.println("Buenos días.");
      } else if (hora >= 13 && hora <= 20) {
        System.out.println("Buenas tardes.");
      } else if ((hora >= 0 && hora <= 5) || (hora > 20 && hora < 24)) {
        System.out.println("Buenas noches.");
      } else {
        System.out.println("Esa hora no existe.");
      }
      System.out.println("");
    } while (hora >= 0 && hora < 24);
    s.close();
  }
}
