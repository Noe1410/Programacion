public class act16 {

  public static void main(String[] args) {
    String figura = "";
    String primeraFigura = "";
    String segundaFigura = "";
    String terceraFigura = "";
    for (int i = 1; i <= 3; i++) {
      int figuras = (int) (Math.random() * 5 + 1);

      switch (figuras) {
        case 1:
          figura = "corazon";
          break;
        case 2:
          figura = "diamante";
          break;
        case 3:
          figura = "herradura";
          break;
        case 4:
          figura = "campana";
          break;
        case 5:
          figura = "limon";
          break;
      }

      System.out.print(figura + " ");

      if (i == 1) {
        primeraFigura = figura;
      }
      if (i == 2) {
        segundaFigura = figura;
      }
      if (i == 3) {
        terceraFigura = figura;
      }
    }
    System.out.println(" ");
    if (
      primeraFigura.equals(segundaFigura) &&
      primeraFigura.equals(terceraFigura) &&
      segundaFigura.equals(terceraFigura)
    ) {
      System.out.print("Enhorabuena, ha ganado 10 monedas.");
    } else if (
      primeraFigura.equals(segundaFigura) ||
      segundaFigura.equals(terceraFigura) ||
      primeraFigura.equals(terceraFigura)
    ) {
        System.out.print("Bien, ha recuperado su moneda.");
    } else {
      System.out.print("Lo siento, ha perdido.");
    }
  }
}
