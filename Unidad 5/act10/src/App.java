import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int numero;
        int media = 0;
        int cantidad = 0;
        System.out.print("Introduce números para calcular su media(cuando se introduzca un número negativo se empezara a calcular la media).");
        do{
            numero = s.nextInt();
            if(numero > 0){
            media+=numero; 
            cantidad++;
            }       
        }while(numero>0);
        System.out.println("La media de los números es: "+(media/cantidad));

        s.close();
    }
}
