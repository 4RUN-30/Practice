package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibo(7,0,1));
    }

    public int fibo(int n,int prev,int next){
        if(n-2 == 0){
            return next;
        }
        return fibo(n-1,next,next+prev);
    }
}
