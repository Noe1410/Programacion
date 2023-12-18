public class act13 {
    public static void main(String[] args) {
        

    int num1;
    int num2;
        do{
            num1 = (int) (Math.random()*7+1);
            num2 = (int) (Math.random()*7+1);

            System.out.println("El primer dado ha soltado un "+num1);
            System.out.println("El primer dado ha soltado un "+num2);
        }while(num1 != num2);
        System.out.println("");
        System.out.println("Los dado han soltado el mismo número.");
    }
}
