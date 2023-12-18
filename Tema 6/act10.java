public class act10 {

  public static void main(String[] args) {
    String caracter = "";
    for (int linea = 1; linea < 11; linea++) {
      int longitudLinea = (int) (Math.random() * 40 + 1);
      int numeroCaracter = (int) (Math.random() * 3 + 1);
      
      for (int fila = 1; fila < longitudLinea; fila++) {
        switch (numeroCaracter) {
          case 1:
            caracter = "*";
            break;
          case 2:
            caracter = "-";
            break;
          case 3:
            caracter = "=";
            break;
          case 4:
            caracter = ".";
            break;
          case 5:
            caracter = "|";
            break;
          case 6:
            caracter = "@";
            break;
        }
        System.out.print(caracter + "  ");
      }
      System.out.println("  ");
    }
  }
}
