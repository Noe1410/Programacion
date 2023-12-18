import java.util.Scanner;

public class act14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int oportunidad = 5;
    int numeroOculto;
    int maximo = 100;
    int minimo = 0;
    String respuesta;

    do {
    numeroOculto = (int) (Math.random() * (maximo - minimo)+minimo);
        
        System.out.println("¿Es este número "+numeroOculto+" mayor, menor o igual que el que estas pensando?");
        respuesta = s.nextLine().toLowerCase();

        oportunidad--;

        if (respuesta.equals("menor")) {
          minimo = numeroOculto+1;

        } else if (respuesta.equals("mayor")) {
          maximo = numeroOculto-1;
        }

    } while (oportunidad >= 1 && !respuesta.equals("igual"));

    if ( oportunidad > 1) {
      System.out.println("¡Vamos! Lo he logrado.");
    } else {
      System.out.println("Me he quedado sin intentos.");
    }

    s.close();
  }
}