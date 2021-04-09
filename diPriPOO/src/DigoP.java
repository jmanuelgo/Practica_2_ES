import java.util.Scanner;
public class DigoP {
    public static void main(String[] args)
    {
        Modulo f =new Modulo();
        Scanner obtenerNumero = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        System.out.println(f.pri(numero));
}
}
