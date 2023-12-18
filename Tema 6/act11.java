public class act11 {
    public static void main(String[] args) {

        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
System.out.print("Estas han sido las notas de la clase: ");
        for(int i = 1; i < 21; i++){
            int nota = (int) (Math.random() *11);

            if(nota >= 0 && nota < 5){
                suspenso++;
            }else if(nota == 5){
                suficiente++;
            }else if(nota == 6){
                bien++;
            }else if(nota >= 7 && nota < 9){
                notable++;
            }else{
                sobresaliente++;
            }
            System.out.print(nota+" ");
        }
        System.out.printf("\n\nHan habido %d suspensos.\n",suspenso);
        System.out.println("Han habido "+suficiente+" suficientes.");
        System.out.println("Han habido "+bien+" bienes.");
        System.out.println("Han habido "+notable+" notables.");
        System.out.println("Han habido "+sobresaliente+" sobresalientes.");

    }
}
