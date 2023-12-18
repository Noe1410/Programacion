import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de MB que quieras pasar a KB.");
        double KB = s.nextDouble();
        double convertirMB = KB/1024;

        System.out.println(KB+"KB son "+convertirMB+"MB");

        s.close();
    }
}
