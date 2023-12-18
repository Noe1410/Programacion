public class App {
    public static void main(String[] args) throws Exception {
        int euro=1;
        double conversion = euro*166.386;
        String pesetas="pesetas";
        System.out.printf("Un euro son %.3f %s ",(float)conversion, pesetas);
    }
}
