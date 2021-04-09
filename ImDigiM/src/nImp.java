import java.util.Scanner;
public class nImp {
    public static void main(String[] args) {
        pIm f = new pIm();
        int nu;
        do {
            Scanner read = new Scanner(System.in);
            System.out.print("introduzca un numero ");
            nu = read.nextInt();
        } while (nu < 1000);

        System.out.print("el nuevo numero es: " + f.ciclo(nu));
    }
}
