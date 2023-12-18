import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un número ");
        int numero = s.nextInt();
        int divisores = 1;

        for(int i = 1; i <= numero/2; i++) {
            if(numero % i == 0){
                divisores++;
            }
        }
        if (divisores == 2) {
                System.out.println("El número introducido es primo.");
            }else{
                System.out.println("El número introducido no es primo.");
        }

        s.close();
    }
}
