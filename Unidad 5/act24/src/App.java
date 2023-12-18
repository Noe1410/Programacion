import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int filas = 0;
        int filaInicial;
        System.out.print("Introduzca el numero de filas que quieres que tenga la piramide: ");
        try {
             filas = s.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("No se ha introducido el número de filas");
            System.exit(1);
        }

        for(int i = 1; i <= filas; i++ ){
            for(int espacios = 1; espacios <= filas-i; espacios++){
                System.out.print(" ");
            }
            for(filaInicial = 1; filaInicial <= i; filaInicial++){
                System.out.print(filaInicial);
            }
            for(int filaFinal = i-1; filaFinal >= 1; filaFinal--){
                System.out.print(filaFinal);
            }
            System.out.println("");
        }
        s.close();
    }
}
