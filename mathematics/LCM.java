package mathematics;

public class LCM {
    public static void main(String[] args) {
        System.out.println(optimizedLcm(4,3));
    }
    // O(n)
    public static int lcm(int a,int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        while(true){
            if(max%min==0){
                return max;
            }
            max=max+Math.max(a,b);
        }
    }

    // O(log(n))
    public static int optimizedLcm(int a,int b){
        int gcd = GCD.getOptimizedEuclidGcd(a,b);
        return a*b/gcd;
    }


}
