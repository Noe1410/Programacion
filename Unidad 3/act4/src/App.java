import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System. in);
        
        System.out.println("Introduce dos números separados por un espacio: ");
        double num1 = s.nextDouble(), num2 = s.nextDouble();

        double mult = num1*num2;
        double suma = num1+num2;
        double div = num1/num2;
        double rest = num1-num2;

        System.out.println("La multiplicación de los números introducidos es: "+mult);
        System.out.println("La suma de los numeros introducidos es: "+suma);
        System.out.println("La resta entre el primer número y el segundo es: "+rest);
        System.out.println("La división entre el primer número y el segundo es: "+div);

        s.close();
    }
}
