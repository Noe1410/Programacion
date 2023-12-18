public class act7 {
    public static void main(String[] args) {

        String empate;

        for(int partidos = 1; partidos < 10; partidos++){
            System.out.print("Partido: "+partidos+"   |");
                for(int i = 1; i < 4; i++){
                    int apuesta = (int) (Math.random() * 3+1);
                    switch (apuesta) {
                        case 3:
                            empate = "X";
                            break;
                    
                        default:
                            empate = String.valueOf(apuesta);
                            break;
                    }
                    if(apuesta == 1){
                        System.out.print(empate+"    |");
                    }else if(apuesta == 2){
                        System.out.print("    "+empate+"|");
                    }else{
                        System.out.print("  "+empate+"  |");
                    }
                }    
            System.out.println(" ");
        }
        for(int partidos = 10; partidos < 16; partidos++){
            System.out.print("Partido: "+partidos+"  |");
                for(int i = 10; i < 13; i++){
                    int apuesta = (int) (Math.random() * 3+1);
                    switch (apuesta) {
                        case 3:
                            empate = "X";
                            break;
                    
                        default:
                            empate = String.valueOf(apuesta);
                            break;
                    }
                    if(apuesta == 1){
                        System.out.print(empate+"    |");
                    }else if(apuesta == 2){
                        System.out.print("    "+empate+"|");
                    }else{
                        System.out.print("  "+empate+"  |");
                    }
                }
            System.out.println(" ");
        }
        

    }
}
