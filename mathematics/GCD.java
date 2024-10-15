package mathematics;

public class GCD {
    public static void main(String[] args) {
        System.out.println(getOptimizedEuclidGcd(15,63));
    }

    // O(n)
    public static int getGcd(int a, int b){
        int min = Math.min(a, b);
        while (true){
            if(b%min == 0 && a%min == 0) return min;
            min--;
        }
    }

    // Efficient
    public static int getEuclidGcd(int a, int b){
        while(a!=b){
            if(b>a){
                b = b-a;
            }
            else{
                a = a-b;
            }
        }
        return a;
    }

    // Most Efficient log(n)
    public static int getOptimizedEuclidGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getOptimizedEuclidGcd(b,a%b);
    }


}
