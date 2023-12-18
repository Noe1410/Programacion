import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int exponente, base;

        do{
        System.out.print("Introduce una base y un exponente separados por un espacio: ");
        base = s.nextInt();
        exponente = s.nextInt();
        }while (exponente < 0);

        System.out.print("El resultado es: "+ Math.pow(base, exponente));

        s.close();
    }
}
