import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce la altura del triángulo: ");
        int altura = s.nextInt();

        System.out.print("Introduce el caracter con el que quieras que se forme la piramide: ");
        String caracter = s.next();

        for (int i = 1; i<=altura; i++){
            for(int espacio = 1; espacio <= altura-i; espacio++){
                System.out.printf(" ");
            }
            for( int piramide = 1; piramide <= (piramide+i)/2; piramide++){
              System.out.printf("%s ",caracter);
            }
            System.out.printf("\n");
        }
        s.close();
    }
}
