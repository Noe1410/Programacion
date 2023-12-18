import  java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca números separados por un espacio(si el numero introducido es negativo se acababra la sucesión de los numeros introducidos): ");
        int num;
        
        int contadorNum = 0;
        int totalPar = 0;
        int comparador = 2;
        int totalImpar = 0;
        int contadorImpar = 0;

        do{
            num = s.nextInt();
            if(num > 0){
                contadorNum++;
                if(num % 2 == 0 && num > comparador){
                    comparador = num;
                    totalPar++;
                }
                if (num % 2 != 0){
                    totalImpar+=num;
                    contadorImpar++;
                }
            }
        }while (num > 0);
        System.out.println("Se han introducido "+contadorNum+" números.");
        System.out.println("La  media de los numeros impares es: "+totalImpar/contadorImpar);

        if(totalPar == 0){
            System.out.println("No se han introducido números pares.");
        }else{
            System.out.println("El mayor número par introducido es: "+comparador);
        }

        s.close();
    }
}
