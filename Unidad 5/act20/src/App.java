import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce la altura del triángulo: ");
        int altura = s.nextInt();

        System.out.print("Introduce el caracter con el que quieras que se forme la piramide: ");
        String caracter = s.next();

        for(int espacio = 1; espacio <= altura-1; espacio++){
            System.out.printf(" ");
        }
        System.out.println("*");
        for (int i = 1; i<=altura; i++){
            for(int espacio = 1; espacio <= altura-i; espacio++){
                System.out.printf(" ");
            }
            for( int piramide = 1; piramide <= 2*i-1; piramide++){
              if(altura == i || piramide == 1 || piramide == 2*i-1){
                System.out.printf("%s",caracter);
              }else{
                System.out.printf(" ");
              }
            }
            System.out.printf("\n");
        }
        for(int espacio = 1; espacio <= altura-1; espacio++){
            System.out.printf(" ");
        }
        System.out.println("Y");
        s.close();
    }
}
