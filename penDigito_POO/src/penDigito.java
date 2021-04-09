import java.util.Scanner;
public class penDigito {
    public static void main(String[] args) {
        proPen f = new proPen();
        int num;
        Scanner read = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num = read.nextInt();
        }
        while (num < 1000);
        System.out.println("el pltimo digito es: "+ f.div(num) );
    }
}