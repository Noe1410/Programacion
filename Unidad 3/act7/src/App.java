import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner s =new Scanner(System.in);
       
        System.out.println("Introduzaca el total de su factura.");

        double totalfactura = s.nextDouble();
        double IVA = 0.21;

        System.out.println("Asi se queda la factura con la base imponible incluida."+totalfactura*IVA);

        s.close();

    }
}
