import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = s.nextInt();
    
    System.out.print("Introduzca un digito del número anterior: ");
    int dig = s.nextInt();
    
    int numero = numeroIntroducido;
    int volteado = 0;
    int posicion = 1;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    while (volteado > 0) {
        if (volteado % 10 == dig) {
          System.out.println("El digito introducido se encuentra en la posición  "+posicion);
        }
        volteado /= 10;
        posicion++;
      }

    s.close();
  }
}
