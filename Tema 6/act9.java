public class act9 {

  public static void main(String[] args) {
    int num;
    long contador = 0;
    do {
      num = (int) (Math.random() * 101);

      if (num % 2 == 0) {
        System.out.println(num + " ");
      }

      contador++;
    } while (num != 24);
    System.out.println("Se han introducido "+contador+" numeros");
  }
}
