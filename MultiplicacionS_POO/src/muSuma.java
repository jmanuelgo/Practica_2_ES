import java.util.Scanner;
public class muSuma {
    public static void main (String [] args){
        int num1, num2;
        mulSuma f = new mulSuma();
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese un número");
        num1 = read.nextInt();
        System.out.println("ingrese un número");
        num2 = read.nextInt();
        System.out.println(" "+f.mulS( num1,num2));
    }
}
