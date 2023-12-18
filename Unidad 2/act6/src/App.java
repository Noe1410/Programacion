public class App {
    public static void main(String[] args) throws Exception {
        int factura = 20;
        double IVA = 0.21;
        double precioconIVA = (IVA*factura)+factura;
        System.out.printf("La facutra sin IVA es %d euros, con IVA es %.2f", factura, precioconIVA);
    }
}
