public class act2 {
    public static void main(String[] args) {
    
        System.out.println("Generación aleatoria de la baraja francesa.");

        int numPalo = (int)(Math.random()*4+1);
        String palo;

        if(numPalo == 1){
            palo = "pica";
        }else if(numPalo == 2){
            palo = "corazone";
        }else if(numPalo == 3){
            palo = "diamante";
        }else{
            palo = "trébol";
        }
        

        int numCarta = (int)(Math.random()*13+1);
        String carta;
        switch (numCarta) {
            case 1:
                carta = "As";                
                break;

            case 11:
                carta = "Sota";                
                break;           
            
            case 12:
                carta = "Reina";                
                break;
        
            case 13:
                carta = "Rey";                
                break;
                       
            default:
                carta = String.valueOf(numCarta);
                break;
        }

        System.out.println("La carta que ha salido ha sido el "+carta+" de "+palo);
    }
}
