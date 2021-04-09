import java.util.Scanner;
public class priDigito {
    public static void main (String [] args){
        proUl f = new proUl();
        int num;
        Scanner read= new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num= read.nextInt();
        }while (num<1000);
        System.out.println("El primer digito es: "+f.mod(num));
    }
}
