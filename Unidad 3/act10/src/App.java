import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de MB que quieras pasar a KB.");
        double MB = s.nextDouble();
        double convertirKB = MB*1024;

        System.out.println(MB+"MB son "+convertirKB+"KB");

        s.close();
    }
}
