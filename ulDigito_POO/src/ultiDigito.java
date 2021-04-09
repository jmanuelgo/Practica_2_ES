import java.util.Scanner;
public class ultiDigito {
    public static void main (String [] args){
        ulDigito_P f = new ulDigito_P();
        int num;
        Scanner read= new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num= read.nextInt();
        }while (num<1000);
        System.out.println("El ultimo digito es:  "+ f.modular(num));
    }
}
