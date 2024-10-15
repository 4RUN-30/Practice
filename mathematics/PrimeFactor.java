package mathematics;

public class PrimeFactor {
    public static void main(String[] args) {
        primeFactors(450);
    }
    public static void primeFactors(int n){
        int p = 2;
        while(n!=1){
            if(n%p==0){
                n=n/p;
                System.out.println(p);
            }
            else{
                p++;
            }
        }
    }
}
