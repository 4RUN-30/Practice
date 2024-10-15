package mathematics;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(10));;
    }
    static int isPrime(int N){
        if(N<=1) return 0;
        for(int i=2;i*i<=N;i++){
            if(N%i == 0) return 0;
        }
        return 1;
    }
}
