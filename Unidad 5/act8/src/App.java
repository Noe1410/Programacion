import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int cifra = 0;

        System.out.print("Introduce un númro: ");
        int numero = s.nextInt();

        do{
            numero/=10;
            cifra++;
        }while(numero>0);

        System.out.println("El numero tiene "+cifra+" cifras.");

        s.close();
    }
}
