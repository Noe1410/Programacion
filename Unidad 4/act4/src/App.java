import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("¿Cuántas horas echas a la semana?");
    int hora = s.nextInt();

    if (hora <= 0) {
      System.out.println("Esa hora no es valida.");
    } else if (hora <= 40) {
      System.out.println("Usted cobra a la semana: " + hora * 12);
    } else {
      System.out.println(
        "Debido a sus horas extras usted ha ganado: " + hora * 16
      );
    }
    s.close();
  }
}
