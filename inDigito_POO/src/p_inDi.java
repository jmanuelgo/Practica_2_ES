public class p_inDi {
    public int modu(int n){
        int inv=0,resto;
        while (n>0){
            resto=n%10;
            inv=inv*10+resto;
            n/=10;
        }
        return inv;
    }
}
