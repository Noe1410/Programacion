import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la nota del primer examen: ");
        double nta1exam = s.nextDouble();

        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        double ntatrim = s.nextDouble();
        double ntanesc = (ntatrim-0.4*nta1exam)/0.6     ;

        System.out.println("La nota necesaria para sacar un "+ntatrim+" sera "+ntanesc);
        s.close();

        
    }
}
