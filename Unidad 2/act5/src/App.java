public class App {
    public static void main(String[] args) throws Exception {
                int pesetas=1;
                double conversion = pesetas*0.00601012;
                String euros="euros";
                System.out.printf("Una peseta son %.3f %s ",(float)conversion, euros);
    }
}
