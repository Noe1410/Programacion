public class multiplosdecinco {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hecho con bucle for.");
        for(int i = 0; i<=100; i++){
            if(i%5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("Hecho con bucle while");

        int u = 0;
        while ( u <= 100) {
            if(u%5 == 0){
                System.out.println(u);
            }
            u++;
        }
        System.out.println("");
        System.out.println("Hecho con bucle do-while");

        int v = 0;
        do{
            if(v%5 == 0){
                System.out.println(v);
            }
            v++;
        }while(v<=100);
        }
    }
