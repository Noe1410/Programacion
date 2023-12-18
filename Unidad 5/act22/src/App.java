import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Voy a mostrar todos los numeros primos entre 2 y 100: ");
    int num = 2;
    int i = 2;

    while (num <= 100) {
      while (i <= Math.sqrt(num) && num % i != 0) {
        i++;
      }
      if(i > Math.sqrt(num)){
        System.out.print(num+" ");
      }
      num++;
      i = 2;
    }

    s.close();
  }
}
