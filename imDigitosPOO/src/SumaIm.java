import java.util.Scanner;
public class SumaIm {

    public static void main(String[] args) {
        proIm f = new proIm();
        int nu;
        do {
            Scanner read = new Scanner(System.in);
            System.out.print("introduzca un numero ");
            nu = read.nextInt();
        } while (nu < 1000);

        System.out.print("el nuevo numero es: " + f.ciclo(nu));
    }
}