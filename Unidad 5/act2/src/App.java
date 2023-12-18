public class App {
    public static void main(String[] args) throws Exception {
        int i = 320;
        System.out.println("Hecho con bucle for");
        for(i = 320; i >= 160; i = i-20 ){
            System.out.println(i);
        }
        
        System.out.println("");
        
        System.out.println("Hecho con bucle while");
        int u = 320;
        while (u >= 160) {
            System.out.println(u);
            u = u-20;
        }

        System.out.println("");
        
        
        int v = 320;
        System.out.println("Hecho con bucle do-while");
        do{
            System.out.println(v);
            v = v-20;
        }while(v >= 160);
    }
}
