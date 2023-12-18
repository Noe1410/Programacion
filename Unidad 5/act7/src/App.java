import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int contraseñaOriginal = 1420;
    int intentos = 4;
    int contraseña;

    do {
      System.out.print("Introduzca la contraseña: ");
      contraseña = s.nextInt();

      if (contraseña > 999 && contraseña < 10000) {
        intentos--;

        System.out.println(
          "Lo siento, esa no es la combinación correcta, intentos restantes: " +
          intentos
        );
      }
      if (contraseña <= 999 || contraseña >= 10000) {
        System.out.println("Debe tener cuatro digitos ");
      }
    } while (intentos >= 1 && contraseña != contraseñaOriginal);

    System.out.println("");

    if (intentos >= 1) {
      System.out.print("Te quedaste sin intentos.");
    } else if (contraseña == contraseñaOriginal) {
      System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
    }

    s.close();
  }
}
