import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int numeroTope = s.nextInt();
    int inicio = 1;
    int suma = 0;
    int cantidadNumero = 0;

    do {
      suma += inicio;
      inicio += 3;
      System.out.println(inicio + " ");
      cantidadNumero++;
    } while (inicio < numeroTope);
    System.out.print("");
    System.out.print(
      "La cantidad de números saliente es:  " + cantidadNumero + "\n"
    );
    System.out.print("La suma de todos los números es:  " + suma);

    s.close();
  }
}
