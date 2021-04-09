public class factorial_N {
public int p_Factorial(int n){
    int fac=1;
    while (n !=0){
        fac=fac*n;
        n--;
    }
    return fac;
}
}
