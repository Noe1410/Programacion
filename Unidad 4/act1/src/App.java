import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un día de la semana.");
        int diasemana = s.nextInt();

        switch (diasemana){
                case 1:
                        System.out.println("El lunes ahi sistemas informáticos a primera hora.");
                        break;
                case 2:
                        System.out.println("El martes ahi sistemas informáticos a primera hora.");
                        break;
                case 3:
                        System.out.println("El miercoles ahi bases de datos a primera hora.");
                        break;
                case 4:
                        System.out.println("El jueves ahi bases de datos a primera hora.");
                        break;
                case 5:
                        System.out.println("El Viernes ahi lenguaje de marcas a primera hora.");
                        break;
                default:
                        System.out.println("Introduzaca un día lectivo por favor.");
                        break;

        }

        s.close();

    }
}
