public class pIm {
    public int ciclo(int n){
        int resto, num=0 ;
        while (n>0){
            resto=n%10;
            if (resto% 2!=0){
                num=num*10+resto;

            }
            n/=10;
        }
        return num;
    }
}
