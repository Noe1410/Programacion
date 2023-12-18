import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System. in);
        
        System.out.println("Introduce dos números separados por un espacio: ");
        double num1 = s.nextDouble(), num2 = s.nextDouble();

        double mult = num1*num2;

        System.out.println("La multiplicación de los números introducidos es: "+mult);
    }
}
