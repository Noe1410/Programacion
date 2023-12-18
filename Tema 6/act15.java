public class act15 {
    public static void main(String[] args) {
        
        String nota = "";
        String notafinal = "";
            int Melodia = (int) (Math.random()*7+1)*4;
            for(int i= 1; i <= Melodia; i++){

                int notaNum = (int) (Math.random()*7+1);

                switch (notaNum) {
                    case 1:
                        nota = "do";
                        break;
                    case 2:
                        nota = "re";
                        break;
                    case 3:
                        nota = "mi";
                        break;
                    case 4:
                        nota = "fa";
                        break;
                    case 5:
                        nota = "sol";
                        break;
                    case 6:
                        nota = "la";
                        break;
                    case 7:
                        nota = "si";
                        break;
                }

                if(i < Melodia){
                    System.out.print(nota+" ");
                }
                
                if(i == 1){
                    notafinal = nota;
                }

                if(i == Melodia){
                    System.out.print(notafinal+" ");
                    System.out.print("|");

                }

                if(i % 4 == 0){
                   System.out.print("| "); 
                }
            }    
    }   
}
