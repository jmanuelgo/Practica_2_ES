public class Modulo {
    public int pri(int n){
        int i,primo=0,resto;
        while (n>0){
            int contador=0;
            resto=n%10;
            for(i = 1; i <= resto; i++)
            {

                if((resto % i) == 0)
                {

                    contador++;
                }
                if (contador == 2){

                    i=resto;
                }

            }
            if(contador == 2 )
            {
                primo=primo*10+resto;

            }
            n/=10;

    }
        return primo;
}
}
