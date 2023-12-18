import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    long numero = 0;
    long sumDiezK = 0;
    long numerosAcumulados = 0;

    //Acumulación de los números introducidos para saber si superan el valor de 10000.
    do {
      System.out.print("Introduce un número: ");
      try {
        numero = s.nextLong();
      } catch (Exception e) {
        // TODO: handle exception
        System.err.println("No se ha introducido un número.");
        System.exit(1);
      }

      sumDiezK += numero;
      numerosAcumulados++;
    } while (sumDiezK < 10000);

    System.out.println("");
    System.out.println("El total acumulado es de: " + sumDiezK);
    System.out.println("Se han introducido " + numerosAcumulados + " numeros.");
    System.out.println(
      "La media de los números introducidos es de: " +
      (sumDiezK / numerosAcumulados)
    );

    s.close();
  }
}
