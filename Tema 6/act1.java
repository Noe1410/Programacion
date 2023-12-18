import java.util.Scanner;

/**
 * act1
 */
public class act1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este dado muestra el número que sale despues de lanzar tres dados");

        int acumulador = 0;
        int totalAcumulador = 0;
        for(int i = 1; i < 4; i++){

            acumulador += (Math.random()*6+1);
            System.out.println(acumulador);
            totalAcumulador += acumulador;
            acumulador = 0;
        }

        System.out.println("La suma de los números es: "+totalAcumulador);
        s.close();
    }
}