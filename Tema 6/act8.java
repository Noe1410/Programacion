public class act8 {
    public static void main(String[] args) {

        String empate = "";

        for(int partidos = 1; partidos < 10; partidos++){
            System.out.print("Partido: "+partidos+"   |");
                for(int i = 1; i < 4; i++){
                    int apuesta = (int) (Math.random() * 6+1);
                    switch (apuesta) {
                        case 1:
                        case 2:
                        case 3:
                            empate = String.valueOf(1);
                            break;
                        case 4:
                            empate = String.valueOf(2);
                            break;
                        case 5:
                        case 6:
                            empate = "X"; 
                            break;
                    }
                    if(apuesta <= 4){
                        System.out.print(empate+"    |");
                    }else if(apuesta == 4){
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
                        case 1:
                        case 2:
                        case 3:
                            empate = String.valueOf(1);
                            break;
                        case 4:
                            empate = String.valueOf(2);
                            break;
                        case 5:
                        case 6:
                            empate = "X"; 
                            break;
                    }
                    if(apuesta <= 4){
                        System.out.print(empate+"    |");
                    }else if(apuesta == 4){
                        System.out.print("    "+empate+"|");
                    }else{
                        System.out.print("  "+empate+"  |");
                    }
                }
            System.out.println(" ");
        }
    }
}
