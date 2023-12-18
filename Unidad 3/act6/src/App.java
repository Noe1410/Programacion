import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
 
        
        System.out.println("Introduce la altura y la base del triangulo con espacios.");
         
        double altura = s.nextDouble();
        double base = s.nextDouble();

        System.out.println("El area del triángulo es: "+(altura*base)/2);

        s.close();
    }
}
