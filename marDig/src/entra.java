public class entra {
    public int may(int n){
        int resto,mayor=0;
        while (n>0){
            resto=n%10;
            if (mayor<resto){
                mayor=resto;
            }
            n/=10;
        }
        return mayor;
    }
}
