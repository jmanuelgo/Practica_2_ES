import java.util.Scanner;
public class Factorial {
    public static void main (String [] args){
        int nf;
    factorial_N f=new factorial_N();
    Scanner read = new Scanner (System.in);
    do {
         nf = read.nextInt();
    }while (nf <=0);
        System.out.println("El factorial es:"+f.p_Factorial(nf));
    }
}
