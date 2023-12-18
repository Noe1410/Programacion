import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("¿Cuántas horas has trabajadoe esta semana?");
        
        double horas = s.nextDouble();
        double sueldo = 12;

        System.out.println("Esta semana has ganado la friolera cantidad de "+horas*sueldo+("$"));

        s.close();


    }
}
