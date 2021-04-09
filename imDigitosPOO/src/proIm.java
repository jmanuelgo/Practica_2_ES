public class proIm {
    public int ciclo(int n){
        int resto, num=0 ;
        while (n>0){
            resto=n%10;
            if (resto% 2!=0){
                num+=resto;
            //System.out.print(resto);
            }
            n/=10;
    }
        return num;
}
}
