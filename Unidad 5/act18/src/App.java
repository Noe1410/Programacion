import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
        System.out.print("Introduce dos número separados por un espacio: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int numeroAcumulado = num1+7, acumuladorSiete = 7;

        System.out.print("Los números enteros incrementando 7 entre "+num1+" y "+num2+" son los siguientes: ");
        do{
            System.out.print( numeroAcumulado+", ");
            numeroAcumulado += acumuladorSiete;
        }while(numeroAcumulado <= num2);

        s.close();
    }
}
