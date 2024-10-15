package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieveOfEratosthenes(30);
    }
    static void sieveOfEratosthenes(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);

        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j] = false;
                }
            }
        }

        for (int i=0;i<prime.length;i++){
            System.out.println(i+ " "+prime[i]);
        }
    }
    

}
