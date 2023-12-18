import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la altura y el radio del cono con espacios.");

        double h = s.nextDouble(), r = s.nextDouble();

        System.out.println("El area del cono es: "+(Math.PI*Math.pow(r,2)*h));

        s.close();
    }
}
