import java.util.Scanner;

public class act6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int oportunidad = 5;
    int intento;

    int numeroOculto = (int) (Math.random() * 101);

    do {
      do {
        System.out.print(
          "Intenta adivinar el número oculto. "
        );
        intento = s.nextInt();
        if (intento < 0) {
          System.out.println("Inserte un número mayor que -1. ");
        } else if (intento > 100) {
          System.out.println("Inserte un número menor que 101. ");
        }
      } while (intento < 0 && intento > 100);

      if (intento >= 0 && intento <= 100) {
        
        oportunidad--;

        if (intento > numeroOculto) {
          System.out.println("Incorrecto, el número pculto es menor.");
          System.out.println("Te quedan " + oportunidad + " intentos.");
        } else if (intento < numeroOculto) {
          System.out.println("Incorrecto, el número oculto es mayor.");
          System.out.println("Te quedan " + oportunidad + " intentos.");
        }

      }
    } while (oportunidad >= 1 && intento != numeroOculto);

    if (intento == numeroOculto) {
      System.out.println("Enhorabuena, has acertado el número.");
    } else {
      System.out.println("Te has quedado sin intentos.");
    }

    s.close();
  }
}
