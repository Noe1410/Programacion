public class act12 {
    public static void main(String[] args) {
        int num = 1;
        do{
            int matrix = (int) (Math.random()*126+32);
            System.out.printf("\033[32m %s  ",(char)matrix);
        }while( num != 0);
    }
}
