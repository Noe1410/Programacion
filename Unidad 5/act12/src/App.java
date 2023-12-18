import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántos numeros de la serie de fibonacci queires que aparezcan? ");
        long cantidad = s.nextLong();
        long anterior = 0;
        long siguiente = 1;

        for(long i = 1; i <= cantidad/2; i++){
            System.out.printf("%4d",anterior);
            System.out.printf("%4d",siguiente);

            anterior+=siguiente;
            siguiente+=anterior;
        }
        s.close();
    }
}
